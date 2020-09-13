package Sorting;

import java.util.Hashtable;


/***
 *  Worst sorting algorithm - TC
 *    1. Bubble
 *    2. Selection
 *    3. Insertion    -- O(n*n)
 *
 *
 *    1.Merge Sort
 *    2.Quick Sort  --- O(nlogn)
 *  ================================
 *    === Based if certain conditions hold true
 *    Count sort
 *    Bucket Sort
 *    Redix sort  --  O(n)
 *
 *    External sort
 *
 *
 *
 *
 */

public class BubbleSorting {

  /**
   *
   * [ 4,1,2,5,3]    [1,2,4,3]      [1,2,3]     [1,2]   [1]
   *
   *
   * [1,2,4,3,5]     [ 1,2,3,4]     [1,2,3]     [1,2]    [1]
   *
   * [1,2,3,4,5] Sorted
   *
   */

 // 1,2,3,5,4
  public void bubbleSort(int[] arr){  // TC = O(n*n)

    for(int i=arr.length-1;i>=0;i--){
      boolean isSorted = true ;
      for(int j=0 ;j<i;j++){

        if(arr[j]>arr[j+1]){
          isSorted = false ;
          int t = arr[j];
          arr[j]= arr[j+1];
          arr[j+1]=t ;
        }
      }
      if(isSorted){
        return;
      }
    }

  }


  public void selectionSort(int[] arr){

    Hashtable ht = new Hashtable();

    int n = arr.length ;

    for(int i=0;i<n;i++){
      int smallest  = i ; // assumed that smallest element is at ith

      for(int j=i+1;j<n;j++){
        if(arr[j] < arr[smallest]){  // o(n*n)
          smallest = j ;
        }
      }
      //swap  -- o(n)
      int temp = arr[i];
      arr[i] = arr[smallest];
      arr[smallest]=temp;
    }
  }

  /**
   *
   * BS -TC o(n2)
   *     No comparisons = O(n2)
   *     No of swaps = o(n2)
   *
   *
   */

}
