import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/*
Want-To:
  function that returns a randomly unsorted array of integers?
  takes length, returns array
  * Can there be duplicates?
  Range the numbers  = [0, 2*(length of aray)]
  * Maybe have program 'wait for 10 seconds'
  * How long algo takes to run

  User input asks for length of array
  Then waits, sorts the aray, prints out the time in milliseconds to show how
  long each

  1) Take input as integer
  2) Generate array, pick numbers s.t. there are no repeats
  3) Track how long the different algorithms take, print result
  4) Figure out how big n has to be in order for the algos to be
  visibly larger

*/


public class Sorting_ii {

  public static void generate_array(int[] arr) {

    Random rand = new Random();

    int rand_int;

    for (int i = 0; i < arr.length; i++) {
      rand_int = rand.nextInt(arr.length*10);
      arr[i] = rand_int;
    }

  }

  public static long bubble_sort_multi(int arr[], int x) {

    // Sort the array x-times, return the total time

    int tmp[];
    int time = 0;
    long startTime = System.nanoTime();
    long endTime = System.nanoTime();

    for (int i=0; i <= x; i++) {

      tmp = arr.clone();

      startTime = System.nanoTime();

      bubble_sort(tmp);

      // 'End' timer
      endTime = System.nanoTime();

      time += endTime-startTime;

    }

    return time/x;
  }


  public static void bubble_sort(int arr[]) {
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

  public static long insertion_sort_multi(int arr[], int x) {

    // Sort the array x-times, return the total time

    int tmp[];
    int time = 0;
    long startTime = System.nanoTime();
    long endTime = System.nanoTime();

    for (int i=0; i <= x; i++) {

      tmp = arr.clone();

      startTime = System.nanoTime();

      insertion_sort(tmp);

      // 'End' timer
      endTime = System.nanoTime();

      time += endTime-startTime;

    }

    return time/x;
  }




  public static void insertion_sort(int arr[]) {
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

    public static void selection_sort(int arr[]) {
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

    public static long selection_sort_multi(int arr[], int x) {

      // Sort the array x-times, return the total time

      int tmp[];
      int time = 0;
      long startTime = System.nanoTime();
      long endTime = System.nanoTime();

      for (int i=0; i <= x; i++) {

        tmp = arr.clone();

        startTime = System.nanoTime();

        selection_sort(tmp);

        // 'End' timer
        endTime = System.nanoTime();

        time += endTime-startTime;

      }

      return time/x;
    }



  public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

      System.out.print("Hello World! \nEnter how large you want the array to be (large positive integer): ");
      String userInput = scanner.next();

      // System.out.println(userInput);
      System.out.println("Generating unsorted array of size: " + userInput);

      // Some sort of animation?

      // Generate integer array of size n.
      int size = Integer.parseInt(userInput);
      int[] intArray = new int[size];

      generate_array(intArray);

      // System.out.print("Randomly generated array is: ");

      // printArray(intArray);


      // Make two more copies, sort via each algorithm, print time.
      int intArray2[] = intArray.clone();
      int intArray3[] = intArray.clone();

      int cycles = 1000;


      // --------------
      // |Bubble Sort:|
      // --------------

      // long startTime = System.nanoTime();
      long time = 0;

      time = bubble_sort_multi(intArray, cycles);

      // 'End' timer
      // long endTime = System.nanoTime();

      // long timeElapsed = endTime-startTime;

      try {
          Thread.sleep(1000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }


      System.out.println("[Bubble    Sort] Execution time in nanoseconds  : " + time);

      // -----------------
      // |Insertion Sort:|
      // -----------------

      // startTime = System.nanoTime();

      // insertion_sort(intArray2);

      // time = insertion_sort_multi(intArray2, cycles);

      // 'End' timer
      // endTime = System.nanoTime();

      // timeElapsed = endTime-startTime;

      // try {
      //     Thread.sleep(1000);
      // }
      // catch(InterruptedException ex)
      // {
      //     Thread.currentThread().interrupt();
      // }
      //
      // System.out.println("[Insertion Sort] Execution time in nanoseconds  : " + time);

      // -----------------
      // |Selection Sort:|
      // -----------------

      // startTime = System.nanoTime();

      // selection_sort(intArray3);


      // 'End' timer
      // endTime = System.nanoTime();

      // timeElapsed = endTime-startTime;

      try {
          Thread.sleep(1000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }

      time = selection_sort_multi(intArray3, cycles);

      System.out.println("[Selection Sort] Execution time in nanoseconds  : " + time);

      try {
          Thread.sleep(1000);
      }
      catch(InterruptedException ex)
      {
          Thread.currentThread().interrupt();
      }

      System.out.println("Done :)");

  }

}
