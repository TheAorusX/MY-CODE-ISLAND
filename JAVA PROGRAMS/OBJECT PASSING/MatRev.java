import java.util.Scanner;

class MatRev {
    private int[][] arr;
    private int m, n;

    // Parameterized constructor to initialize the data members
    public MatRev(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    // Method to enter elements in the array
    public void fillArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
            
        }
    }

    // Method to return the reverse of a number
    public int reverse(int x) {
        int rev = 0;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x = x / 10;
        }
        return rev;
    }

    // Method to reverse each element of the array
    public void revMat(MatRev P) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = reverse(P.arr[i][j]);
            }
        }
    }

    // Method to display the array elements in matrix form
    public void show() {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Main method to create objects and perform the operations
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        // Create an object of MatRev class
        MatRev original = new MatRev(rows, cols);
        original.fillArray();

        // Create another object to store the reversed matrix
        MatRev reversed = new MatRev(rows, cols);
        reversed.revMat(original);

        // Display the original and reversed matrices
        System.out.println("Original Matrix:");
        original.show();

        System.out.println("Reversed Matrix:");
        reversed.show();
    }
}
