public class Recursion {




  public static int lengthOfString(String str, int i) {
    if (i >= str.length()) {
      return 0;
    }
    str  = str.substring(1);
    return 1 + lengthOfString(str, i + 1);  //return me the leng frorm i+1 to end


  }

  public static int lenString(char[] arr, int i) {
    if (i >= arr.length) {
      return 0;
    }

    return 1 + lenString(arr, i + 1);  //return me the leng frorm i+1 to end


  }


  public static  boolean isPalin(char[] arr , int sI , int eI){

    if(sI>=eI){
      return true ;
    }

    if(arr[sI] !=arr[eI]){
      return false ;
    }

    return isPalin(arr, sI+1 , eI-1);

  }

  public static void main(String[] args) {

    long a = 12 ;


    Long pqr  = 1234L ;

    a= pqr;
    char[] arr1 = {'a','b','a'};
    //char[] arr2 = {'a','b','c','d','a'};

    System.out.println(isPalin(arr1,0,arr1.length-1));

    //System.out.println(isPalin(arr2,0,arr2.length-1));
  }
}
