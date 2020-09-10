package Sorting;

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

    for(int i=arr.length-1;i>=0;i--){   //[ 1,2,4,3,5]   i=4,3
      for(int j=0 ;j<i;j++){   //j=0 --> 3

        if(arr[j]>arr[j+1]){
          int t = arr[j];
          arr[j]= arr[j+1];
          arr[j+1]=t ;
        }
      }
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
