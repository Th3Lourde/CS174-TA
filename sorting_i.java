import java.util.concurrent.TimeUnit;
import java.util.*;

/*

Want-To:
  function that returns a randomly unsorted array of integers?
  takes length, returns array
  * Can there be duplicates?
  Range the numbers  = [0, 2*(length of aray)]
  * Maybe have program 'wait for 10 seconds'
  * How long algo takes to run
*/


public class Sorting_i {

    void bubble_sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    void insertion_sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    void selection_sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }



    /* Prints the array */
    void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    void printStrArray(String arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }


    public static void clearScreen() {
      System.out.print("\033[H\033[2J");
      System.out.flush();
    }

    public static int[] get_input() {

      Scanner scanner = new Scanner(System.in);

      Sorting_i bubbleSort = new Sorting_i();

      boolean is_clean = true;

      System.out.print("Hello World! \n Please enter the array that you would like to use (e.g) [1,2,3]: ");
      String userInput = scanner.next();

      // System.out.println("Here is what we know: " + userInput);

      int nums = 0;

      String[] ary = userInput.split(",");

      // bubbleSort.printStrArray(ary);

      // ary[0] = ary[0].replace("\\[", "");

      // String tmp = ary[0].replace("\\[", "");

      // String tmp = ary[0].replaceAll("\\[|\\]", "");

      ary[0] = ary[0].replaceAll("\\[|\\]", "");

      ary[ary.length-1] = ary[ary.length-1].replaceAll("\\]|\\]", "");


      // Convert [str] to [int]

      int[] intArray = new int[ary.length];


      for (int i = 0; i < ary.length; i++) {
        intArray[i] = Integer.valueOf(ary[i]);
      }

      bubbleSort.printArray(intArray);

      is_clean = true;





    return intArray;
    }


  public static void main(String[] args) {

    /*

    Hours spent coding this:
    11/13/19
    Start: 1:15pm
    End: 2:57pm


    Ok so we have a couple of algos that we want to implement:
      - Bubble Sort
      - Insertion Sort
      - Selection Sort

      * For each algo, find a way to track how long the algo takes
      to run

      * Maybe even have a gui (from terminal) that allows the user
      try different algos on the same input without having to re-input
      a list over and over again

      1) Do Bubble Sort: DONE
      2) Insertion Sort: DONE
      3) Selection Sort: DONE
      4) Make 'usable':
         - Say hello
         - Get numbers to test
         - Show menu where user can
         test a single sorting algo
         or all of them
         - Single, prints out each
         iteration of the sorting
         algo (and time spent on the algo)
         - All, same but for all

         - Maybe just print all of them
         - Ok so option to print all of
         them, option to change array



    */

    // --------------
    // |Bubble Sort:|
    // --------------

    int arr[] = {64, 34, 25, 12, 22, 11, 90};
    // int arr[] = {5, 4, 3, 2, 1, 64, 34, 25, 12, 22, 11, 90};


    Sorting_i bubbleSort = new Sorting_i();

    // bubbleSort.printArray(arr);

    // 'Start' timer
    long startTime = System.nanoTime();

    bubbleSort.bubble_sort(arr);

    // 'End' timer
    long endTime = System.nanoTime();

    long timeElapsed = endTime-startTime;


    // System.out.println("[Bubble Sort] Execution time in nanoseconds  : " + timeElapsed);

    // Convert to milliseconds
		// System.out.println("[Bubble Sort] Execution time in milliseconds : " +
		// 						timeElapsed / 1000000);



    // -----------------
    // |Insertion Sort:|
    // -----------------


    Sorting_i insertionSort = new Sorting_i();

    // 'Start' timer
    startTime = System.nanoTime();

    bubbleSort.insertion_sort(arr);

    // 'End' timer
    endTime = System.nanoTime();

    timeElapsed = endTime-startTime;


    // System.out.println("[Insertion Sort] Execution time in nanoseconds  : " + timeElapsed);

    // -----------------
    // |Selection Sort:|
    // -----------------


    Sorting_i selectionSort = new Sorting_i();

    // 'Start' timer
    startTime = System.nanoTime();

    selectionSort.selection_sort(arr);

    // 'End' timer
    endTime = System.nanoTime();

    timeElapsed = endTime-startTime;


    // System.out.println("[Selection Sort] Execution time in nanoseconds  : " + timeElapsed);


    /*
    1) Get user input, ensure it is clean
       - Didn't ensure it was clean, it if is,
       it works
    */

    // boolean is_clean = false;
    //
    // selectionSort.clearScreen();
    // Scanner scanner = new Scanner(System.in);
    //
    // while (is_clean == false) {
    //   System.out.print("Hello World! \n Please enter the array that you would like to use (e.g) [1,2,3]: ");
    //   String userInput = scanner.next();
    //
    //   System.out.println("Here is what we know: " + userInput);
    //
    //   int nums = 0;
    //
    //   String[] ary = userInput.split(",");
    //
    //   bubbleSort.printStrArray(ary);
    //
    //   // ary[0] = ary[0].replace("\\[", "");
    //
    //   // String tmp = ary[0].replace("\\[", "");
    //
    //   // String tmp = ary[0].replaceAll("\\[|\\]", "");
    //
    //   ary[0] = ary[0].replaceAll("\\[|\\]", "");
    //
    //   ary[ary.length-1] = ary[ary.length-1].replaceAll("\\]|\\]", "");
    //
    //
    //   // Convert [str] to [int]
    //
    //   int[] intArray = new int[ary.length];
    //
    //
    //   for (int i = 0; i < ary.length; i++) {
    //     intArray[i] = Integer.valueOf(ary[i]);
    //   }
    //
    //   bubbleSort.printArray(intArray);
    //
    //   is_clean = true;
    //
    //
    //
    // }

    // int[] inputArray = get_input();

    // printArray(inputArray);

    // Sorting_i bubbleSort = new Sorting_i();
    int[] inputArray = bubbleSort.get_input();
    // printArray(inputArray);

    // Ok so now we have converted the input
    // into an [int]. Now what?
    // (1) Bubble Sort (2) Insertion Sort (3) Selection Sort (4) All (5) Change input

    selectionSort.clearScreen();
    // System.out.println("Chose Option:\n (1) Show Bubble Sort \n (2) Show Insertion Sort \n (3) Show Selection Sort \n (4) Show all \n (5) Change input \n (6) Exit");

    boolean play_game = true;
    Scanner scanner = new Scanner(System.in);

    while (play_game == true) {

      System.out.print("Current array: ");

      selectionSort.printArray(inputArray);

      System.out.println("Chose Option:\n (1) Show Bubble Sort \n (2) Show Insertion Sort \n (3) Show Selection Sort \n (4) Show all \n (5) Change input \n (6) Exit");

      String userInput = scanner.next();

      System.out.println(userInput);

      // play_game = false;

      if (userInput.equals("1")) {
        selectionSort.clearScreen();
        System.out.println("Bubble Sort");

      } else if (userInput.equals("2")) {
        selectionSort.clearScreen();
        System.out.println("Insertion Sort");

      } else if (userInput.equals("3")) {
        selectionSort.clearScreen();
        System.out.println("Selection Sort");

      } else if (userInput.equals("4")) {
        selectionSort.clearScreen();
        System.out.println("Show All");

      } else if (userInput.equals("5")) {
        selectionSort.clearScreen();
        System.out.println("Change Input");

      } else if (userInput.equals("6")) {
        selectionSort.clearScreen();
        System.out.println("Goodbye :)");
        play_game = false;

      } else {
        // System.out.println("Invalid Option, try again.");

        // System.out.println("User input: " + userInput);



        // TimeUnit.SECONDS.sleep(2);
        // Thread.sleep(2000);
        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }


        selectionSort.clearScreen();
      }

    }


  }

}
