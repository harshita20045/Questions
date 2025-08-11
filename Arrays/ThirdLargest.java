import java.util.Scanner;

public class ThirdLargest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of elements: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter " + n + " elements:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int first = Integer.MIN_VALUE;
    int second = Integer.MIN_VALUE;
    int third = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > first) {
        third = second;
        second = first;
        first = arr[i];
      } else if (arr[i] > second) {
        third = second;
        second = arr[i];
      } else if (arr[i] > third) {
        third = arr[i];
      }
    }

    System.out.println(third);
    sc.close();
  }
}
