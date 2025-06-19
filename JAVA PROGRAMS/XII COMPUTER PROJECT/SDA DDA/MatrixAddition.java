import java.util.Scanner;
public class MatrixAddition
{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();
            int[][] matrix1 = new int[rows][columns];
            int[][] matrix2 = new int[rows][columns];
            int[][] resultMatrix = new int[rows][columns];
            System.out.println("Enter elements of the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix1[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Enter elements of the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(matrix2[i][j] + " ");
                }
                System.out.println();
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            System.out.println("Resultant matrix after addition:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(resultMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}