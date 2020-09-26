package Sorting;

public class MergeSorting {

  /**
   * if we pass, arr, starting index and end index, this method will sort the elements of the array from the starting index which is passed till end index
   *
   * mergeSort(arr, 0,arr.length-1)
   *
   * mergeSort(arr, 2 , 7)  -- sort the array from index 2 to 7
   *
   * @param arr
   * @param left
   * @param right
   */
  public void mergeSort(int[] arr , int left , int right){   // logn * n  tc = O(nlogn)
    //base condition
    if(left >=right){
      return ;
    }

    int mid = left + (right-left)/2 ;  // (left+right)/2

    //Divide
    mergeSort(arr,left, mid);
    mergeSort(arr, mid+1, right);

    //[5,1,2,4,8,6]  --> [ 1,2,5,   4,6,8]   -> [1,2 ,4, 5,6,8]

    //conquer- merge
    merge(arr, left, mid+1 , right); // efficiently merge the two sorted array into one single sorted array
  }

  private void merge(int[] arr, int left, int mid, int right) {  // TC : O(n) , SC = o(n)

    int sFirst =left ;  //0,1 ,2,3
    int eFirst = mid-1 ;  //2

    int sSecond = mid ; //3,4,5,6
    int eSecond = right ; // 5

    int[] temp = new int[arr.length];  // [ 1,2,4,5,6,8]
    int index = left ; //0,1,2 ,3,4,5,6

    while(sFirst<=eFirst && sSecond <=eSecond){   // [ 1,2,5,   4,6,8]    o(n)

      if(arr[sFirst]<arr[sSecond]){
        temp[index++] = arr[sFirst++];
      }else{
        temp[index++] = arr[sSecond++];
      }
    }

    while(sFirst<=eFirst){
      temp[index++]=arr[sFirst++];
    }

    while (sSecond<=eSecond){
      temp[index++]=arr[eSecond++];
    }

    for(int i=left ;i<=right;i++){
      arr[i]=temp[i];
    }




  }
}
