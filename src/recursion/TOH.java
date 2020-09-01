package recursion;

public class TOH {


  public static int counts(int n , char s , char d , char a){

    // Base condition
    if(n<=1){
      return n ;
    }
    return counts(n-1,s,a ,d) + 1 + counts(n-1,a,d,s);
//    int move1 = counts(n-1,s,a ,d);
//    int move2 = 1 ;
//    int mov3 = counts(n-1,a,d,s);
//
//    return move1 +move2  +mov3 ;
  }



}
