package Strings;

import java.util.Arrays;


public class Anagrams {


  public boolean isAnagram(String str1 , String str2){  //O(nlogn)

    char[] str1A = str1.toCharArray();
    char[] str2A = str2.toCharArray() ;

    Arrays.sort(str1A);  // Merge/Quick  - O(nlogn)
    Arrays.sort(str2A);

     return isAnagramUtil(str1A ,0 , str2A,0) ;

  }
  // O(n)
  private boolean isAnagramUtil(char[] str1A, int i, char[] str2A, int j) {


    if(i<0|| i>=str1A.length || j<0 || j>= str2A.length)

    if(str1A[i] != str2A[j]){
      return false ;
    }

    return  isAnagramUtil(str1A,i+1,str2A,j+1);
  }
}
