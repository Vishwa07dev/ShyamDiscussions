package Strings;

public class Palindrome {


  public static boolean isPalindrome(String s){
    if(s.length()<=1 ||s==null)
      return false;

    int i=0 , j= s.length()-1 ;

    while(i<j){
      if(s.charAt(i) !=s.charAt(j)){
        return false ;
      }
      i++;
      j--;
    }

    return true ;
  }












  private static String str = "abc";

  public static boolean isPalindromerec (String s, int i, int j){


    char[] arr = s.toCharArray();
    if(i>=j)
      return true;
    if(arr[i]!=arr[j])
      return false;

    return isPalindromerec(s,i+1,j-1);
  }

  public static void main(String[] args) {
    String s = "madam";
    System.out.println(isPalindromerec(s,0,s.length()-1));
  }
}
