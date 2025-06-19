import java.util.*;
class DDarray
{
    int m,n;
    int mat[][];
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        DDarray ob=new DDarray();
        ob.readMatrix();
        ob.sum();
        ob.show();
    }
    public void DDarray(int nr,int nc)
    {
        m=nr;
        n=nc;
    }
    public void readMatrix()
    {
        int i,j;
        int mat[][]=new int[m][n];
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        System.out.println("It should be even to find sum of diagonals");
        m=in.nextInt();
        n=m;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                mat[i][j]=in.nextInt();
            }
        }
    }
    public void sum()
    {
        int i,j,LDS=0,RDS=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                LDS+=mat[i][j];
                else if((i+j)==(n-1) || (i+j)==(m-1))
                RDS+=mat[i][j];
            }
        }
        System.out.println("Left Diagonal Element's Sum :"+LDS);
        System.out.println("Right Diagonal Element's Sum :"+RDS);
    }
    public void show()
    {
        int i,j;
        System.out.println("The Array is being printed");
        for(double a=0;a<+1000000;a++)
        {
        }
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
}