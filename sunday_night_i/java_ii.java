

public class Java_ii {

  public void printArray(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

  public static void main(String[] args) {


    int data[] = {3,4,5,6};

    int data2[] = new int[data.length*2];
    int temp=9;
    int temp2=0;
    for(int i=0;i<data.length;i++){
      data2[i]=data[i];
    }

    // printArray(data2);

    for(int j=2;j<data2.length;j++){
      temp2=data2[j];
      data2[j]=temp;
      temp=temp2;
    }

    // printArray(data2);

    Java_ii java_two = new Java_ii();

    java_two.printArray(data2);

  }

}
