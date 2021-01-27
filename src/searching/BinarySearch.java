package searching;

import static java.util.Arrays.*;


public class BinarySearch {


  public int search(int[] arr , int k){ //o(logn)
    int start =0 ;
    int curr = 1 ;

    while(true){   // O(logn)
       if(arr[curr] ==k){
         return curr ;
       }else if(arr[curr] >k){
         break ;
       }else{
         start = curr ;
         curr = curr*2 ;
       }
    }

    return binarySearch(arr, start, curr, k); //O(logn)

  }
}
