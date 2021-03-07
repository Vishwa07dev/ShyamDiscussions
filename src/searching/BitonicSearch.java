package searching;

public class BitonicSearch {

  /**
   * This function should return if the data is present in the array or not
   * @param arr
   * @param data
   * @return
   */
  public boolean isElementPresent(int[] arr , int data){
    // First find the inflexion point
    int inflexionP = findInflexion(arr);
    return searchElement(arr,0, arr.length-1 , inflexionP , data);


  }

  private boolean searchElement(int[] arr, int start, int end, int inflexionP , int data) {

    /**
     * Binary search if data is present between start and inflexionP
     *
     * start -> inflexionP : ascending order
     */

    boolean present = binearySearch(arr, start, inflexionP, data);
    if(present){
      return true;
    }

    /**
     * inflexionpoint+1 -> end ...descending order
     */
    present = binarySearchWhichWorksOnDescedingOrderElements(arr,inflexionP+1,end, data);

    return present ;

  }

  private boolean binarySearchWhichWorksOnDescedingOrderElements(int[] arr, int i, int end, int data) {
    /**
     * Fill the code here
      */
    return false;
  }

  private boolean binearySearch(int[] arr, int start, int inflexionP, int data) {
    /**
     * Fill the code here
     */

    return false;
  }

  private int findInflexion(int[] arr) {
    /**
     * this we have already implemented
     */
    return -1 ;
  }
}
