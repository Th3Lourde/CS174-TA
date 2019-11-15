
public class Class_11_14{

  public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


  public static void selection_sort(int a[]) {

    for (int i=0; i != a.length; i++){
      int position = i;
      int value = a[position];
      int tmp = 0;


      for (int j=i+1; j<a.length; j++) {

        if (a[position] > a[j]) {

          // This works
          tmp = a[position];

          a[position] = a[j];

          a[j] = tmp;


          // This doesn't always work, not sure why :/
          // position = j;
          // value = a[j];
          //
          // a[position] = a[i];
          // a[i] = value;
        }
      }

    }

  }

  public static void bubble_sort(int a[]) {

    for (int k=a.length-1; k >0; k--) {

      boolean swapped = true;

      // Print k to make sure the break
      // actually works correctly
      // System.out.println(k);

      for (int i=0; i != k; i++) {

        if (a[i] > a[i+1]) {

          swapped = false;

          // Swap
          int tmp = a[i];
          a[i] = a[i+1];
          a[i+1] = tmp;

        }
      }

      if (swapped == true) {
        break;
      }

    }

  }


  public static void main(String[] args) {

    // int[] intArray = new int[size];
    int[] data = new int[]{47,31,12,19,1,2,3};

    // int[] data = new int[]{19,1,2,3,4,5};
    int[] data2 = data.clone();


    // -----------------
    // |Selection Sort:|
    // -----------------

    System.out.print("Before [selection_sort]: ");

    printArray(data);

    // There's an eror with the selection sort algo
    // Update: error has been fixed
    selection_sort(data);

    // Since only two integers in k print, instead of all of them,
    // we know that the function exited before both loops completed.
    // Thus we know that our if (swapped == true) caused the function
    // to break (which saves time).

    System.out.print("After  [selection_sort]: ");

    printArray(data);

    System.out.println("");

    // --------------
    // |Bubble Sort:|
    // --------------

    System.out.print("Before [bubble_sort]: ");

    printArray(data2);


    bubble_sort(data2);

    System.out.print("After  [bubble_sort]: ");

    printArray(data2);

  }

}
