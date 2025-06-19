import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input number of elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        // Initialize the array
        int[] arr = new int[n];
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // Find the largest element
        int largest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        // Display the largest element
        System.out.println("The largest element in the array is: " + largest);
        scanner.close();
    }
}
