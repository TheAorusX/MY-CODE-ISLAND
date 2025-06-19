import java.util.*;
public class BinarySearch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the sorted array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of the sorted array:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element to search for: ");
        int target = sc.nextInt();
        int left = 0, right = n - 1, mid, pos = -1;
        while (left <= right) 
        {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                pos = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (pos != -1) {
            System.out.println("Element found at position: " + (pos + 1));
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}