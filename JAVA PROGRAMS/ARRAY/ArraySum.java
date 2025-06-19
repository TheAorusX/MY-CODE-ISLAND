import java.util.Scanner;

public class ArraySum {
    private int[][] arr;
    private int rows;
    private int cols;

    public ArraySum(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        arr = new int[rows][cols];
    }

    public void enterElements() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
    }

    public int calculateSum() {
        int sum = 0;
        for (int[] row : arr) {
            for (int num : row) {
                sum += num;
            }
        }
        return sum;
    }

    public int calculateRowSum(int rowIndex) {
        int rowSum = 0;
        if (rowIndex >= 0 && rowIndex < rows) {
            for (int num : arr[rowIndex]) {
                rowSum += num;
            }
        } else {
            System.out.println("Invalid row index!");
        }
        return rowSum;
    }

    public int calculateColumnSum(int colIndex) {
        int colSum = 0;
        if (colIndex >= 0 && colIndex < cols) {
            for (int i = 0; i < rows; i++) {
                colSum += arr[i][colIndex];
            }
        } else {
            System.out.println("Invalid column index!");
        }
        return colSum;
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        ArraySum arraySum = new ArraySum(rows, cols);
        arraySum.enterElements();

        int sum = arraySum.calculateSum();
        System.out.println("Sum of all elements: " + sum);

        System.out.print("Enter the row index to calculate row sum: ");
        int rowIndex = scanner.nextInt();
        int rowSum = arraySum.calculateRowSum(rowIndex);
        System.out.println("Sum of row " + rowIndex + ": " + rowSum);

        System.out.print("Enter the column index to calculate column sum: ");
        int colIndex = scanner.nextInt();
        int colSum = arraySum.calculateColumnSum(colIndex);
        System.out.println("Sum of column " + colIndex + ": " + colSum);
    }
}
