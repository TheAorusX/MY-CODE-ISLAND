public class DoubleArrayConstructor {
    // private instance variable
    private int[][] array;

    // constructor
    public DoubleArrayConstructor(int rows, int columns) {
        array = new int[rows][columns];
    }

    // setElement method
    public void setElement(int row, int column, int value) {
        array[row][column] = value;
    }

    // getElement method
    public int getElement(int row, int column) {
        return array[row][column];
    }

    public static void main()
    {
        int numRows = 3;
        int numColumns = 4;

        // create an instance of DoubleArrayConstructor
        DoubleArrayConstructor myArray = new DoubleArrayConstructor(numRows, numColumns);

        // set elements
        myArray.setElement(0, 0, 1);
        myArray.setElement(1, 2, 3);
        myArray.setElement(2, 1, 2);

        // get elements
        System.out.println("Element at (0, 0): " + myArray.getElement(0, 0));
        System.out.println("Element at (1, 2): " + myArray.getElement(1, 2));
        System.out.println("Element at (2, 1): " + myArray.getElement(2, 1));
    }
}
