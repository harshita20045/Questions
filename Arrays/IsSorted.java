import java.util.Scanner;

public class IsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int number = sc.nextInt();
        
        int[] arr = new int[number];
        System.out.println("Enter " + number + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        
        System.out.println(isSorted);
        sc.close();
    }
}
