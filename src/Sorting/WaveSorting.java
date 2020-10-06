package Sorting;

public class WaveSorting {

  /**
   *
   * 1. Sort this array and try
   *
   *
   * 2. O(n) solution
   *
   * [ 3,5,6,7,8,1,2]
   *
   * [3,6,5,8,1,7,2]
   *
   *
   * @param arr
   */
  public static void waveSort(int [] arr) {
    for (int i = 1; i < arr.length; i=i+2) {
      if(arr[i] < arr[i-1]){
        swap(arr, i,i-1);
      }

      if((i+1) < arr.length && arr[i] < arr[i+1]){
        swap(arr,i,i+1);
      }
    }
  }

  private static void swap(int[] arr, int i , int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j]=temp;
  }

  public static void main(String[] args) {
    int[] arr = { 1,2,3,4,5,6,7,8};

    for(int a : arr){
      System.out.print(a + " , ");
    }

    System.out.println( );

    waveSort(arr);


    for(int a : arr){
      System.out.print(a + " , ");
    }

  }
}
