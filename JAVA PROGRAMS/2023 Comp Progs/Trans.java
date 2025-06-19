import java.util.*;

class Trans {
    int arr[][];
    int m;

    public Trans(int mm) {
        m = mm;
    }

    public void fillarray() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter "+(m*m)+" elements in matrix");
        arr=new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = in.nextInt();
            }
        }
    }

    public void transpose()
     {
        int tr[][] = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                tr[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void display()
    {
        System.out.println("Original Matrix");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose Matrix");
        transpose();
    }
    public static void main(String[] args) {
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int n=in.nextInt();
        Trans ob=new Trans(n);
        ob.fillarray();
        ob.display();
    }
    }
}