import java.util.Arrays;
import java.util.Scanner;

public class LeftRotateByOnce {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
          arr[i]=arr[i+1];
        
        }
        arr[arr.length-1]=temp;
        
            System.out.print(Arrays.toString(arr));
        
        sc.close();
  }
}
