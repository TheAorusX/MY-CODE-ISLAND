import java.util.Scanner;

public class BubbleSort 
{
    public static void main(String[] args) 
    {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input the number of elements in the array
            System.out.print("Enter the number of elements: ");
            int n = scanner.nextInt();
            // Declare the array
            int[] arr = new int[n];
            // Input the elements of the array
            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            // Bubble sort algorithm to sort the array
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Swap arr[j] and arr[j + 1]
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
            // Display the sorted array
            System.out.println("Sorted array:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
