import java.util.*;
class MTRX
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int m,i,j;
        System.out.println("Enter number os rows and columns of Array");
        m=in.nextInt();
        int DDAR[][]=new int[m][m];
        System.out.println("Enter "+(m*m)+"elements");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                DDAR[i][j]=in.nextInt();
            }
        }
        int LDS=0,RDS=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==j)
                LDS+=DDAR[i][j];
                else if((i+j)==(m-1))
                RDS+=DDAR[i][j];
            }
        }
        System.out.println("The Array :)");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(DDAR[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println("The Sum Of Left Diagonal Elements :"+LDS);
        System.out.println("The Sum Of Right Diagonal Elements :"+RDS);
    }
}