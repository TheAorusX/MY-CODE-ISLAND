import java.util.Scanner;
class EqMat {
    int[][] a;
    int m, n;

    // Constructor to initialize the matrix dimensions
    public EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        a = new int[m][n]; // Initialize the matrix
    }

    // Method to read the elements of the matrix
    public void readArray() {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter " + (m * n) + " elements in the array:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }
        }
    }

    // Static method to check if two matrices are equal
    public static boolean check(EqMat P, EqMat Q) {
        // Check if dimensions are the same
        if (P.m != Q.m || P.n != Q.n) {
            return false; // Different dimensions, matrices cannot be equal
        }

        // Compare elements
        for (int i = 0; i < P.m; i++) {
            for (int j = 0; j < P.n; j++) {
                if (P.a[i][j] != Q.a[i][j]) {
                    return false; // If any element differs, matrices are not equal
                }
            }
        }

        return true; // Matrices are equal
    }
    public static void main(String[] args) 
    {
        try (Scanner in = new Scanner(System.in)) {
            // Input dimensions for the first matrix
            System.out.println("Enter the number of rows and columns for the first matrix:");
            int rows1 = in.nextInt();
            int cols1 = in.nextInt();
            EqMat matrix1 = new EqMat(rows1, cols1);
            matrix1.readArray();

            // Input dimensions for the second matrix
            System.out.println("Enter the number of rows and columns for the second matrix:");
            int rows2 = in.nextInt();
            int cols2 = in.nextInt();
            EqMat matrix2 = new EqMat(rows2, cols2);
            matrix2.readArray();

            // Check if the matrices are equal
            if (EqMat.check(matrix1, matrix2)) {
                System.out.println("The matrices are equal.");
            } else {
                System.out.println("The matrices are not equal.");
            }
        }
    }
}