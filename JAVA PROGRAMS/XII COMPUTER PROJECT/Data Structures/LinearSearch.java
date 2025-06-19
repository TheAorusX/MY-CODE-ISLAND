import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();
        
        int pos = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                pos = i;
                break;
            }
        }
        
        if (pos != -1) {
            System.out.println("Element found at position: " + (pos + 1));
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
