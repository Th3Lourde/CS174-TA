/*
Organized by Eli, if you want to talk about
any (yes any) of the code written below
feel free to email me. I'm considering
continuing to do this sort of stuff
(implementing the algos we talk about in class)

If this is helpful please let me know :^)
*/

public class Searching {

  public static boolean verifyPwd(){
    System.out.println("Hello World");
    return false;

  }

  // Linear Searching Method
  public static boolean find(int data[], int target) {

    for (int i = 0; i < data.length; i++ ) {

      if (data[i] == target) {
        return true;
      }

    }

    return false;
  }

  // Binary Search Iterative Method
  public static boolean binary_search_itr(int arr[], int x)
      {
          int l = 0;
          int r = arr.length - 1;

          while (l <= r) {
              int m = l + (r - l) / 2;

              // Check if x is present at mid
              if (arr[m] == x)
                  // return m;
                  return true;

              // If x greater, ignore left half
              if (arr[m] < x)
                  l = m + 1;

              // If x is smaller, ignore right half
              else
                  r = m - 1;
          }

          // if we reach here, then element was
          // not present
          return false;
      }




  // Binary Search Method
  // Recursively
  public static boolean binary_search_rec(int arr[], int l, int r, int x) {
      if (r >= l) {
          int mid = l + (r - l) / 2;

          // If the element is present at the middle
          // itself
          if (arr[mid] == x)
              // return mid;
              return true;

          // If element is smaller than mid, then
          // it can only be present in left subarray
          if (arr[mid] > x)
              return binary_search_rec(arr, l, mid - 1, x);

          // Else the element can only be present
          // in right subarray
          return binary_search_rec(arr, mid + 1, r, x);
      }

      // We reach here when element is not
      // present in array
      // return -1;
      return false;
  }



  public void test() {
    System.out.println("This is a test");
  }


  public static void main(String[] args) {

    // -----------------
    // | Linear Search |
    // -----------------

    Searching linearSearch = new Searching();

    int data[] = {3,4,5,6};
    int target = 2;
    boolean w = false;

    w = linearSearch.find(data, target);


    // -----------------------------
    // | Binary Search Iteratively |
    // -----------------------------

    Searching binarySearch = new Searching();

    // int r = 0;
    boolean r = false;

    target = 6;

    r = binarySearch.binary_search_itr(data, target);

    System.out.println(r);

    // -----------------------------
    // | Binary Search Recursively |
    // -----------------------------

    r = false;

    target = 6;

    r = binarySearch.binary_search_rec(data, 0, data.length-1, target);

    System.out.println(r);
  }

}
