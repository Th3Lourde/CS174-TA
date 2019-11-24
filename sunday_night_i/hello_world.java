

public class Hello_world {

  public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

public static String part1(){
  return "Hello ";
}

public static String part2(){
  return "world!";
}


  public static void main(String[] args) {
    System.out.println(part1()+part2());


    // int data2[] = new int[data.length*2];
    int data2[] = new int[5];


    // System.out.println("Hello There World");
    //
    // int data[] = {3,4,5,6};
    //
    //
    // for (int i = 0; i != data.length; i++){
    //       data2[i] = data[i];
    //
    // }
    //
    //
    //
    //
    // printArray(data2);
    // int valNew = 9;
    // for (int j=2; j != data2.length; j++){
    //   int dummy = data2[j];
    //   data2[j] = valNew;
    //   valNew = dummy;
    // }
    // printArray(data2);
  }

}
