import java.util.*;
class SumOfElement
{
    public static void main()
{
    Scanner in=new Scanner(System.in);
    int nr,nc;
    System.out.println("Enter the number of rows and columns");
    nr=in.nextInt();
    nc=in.nextInt();
    
    int ddr[][]=new int[nr][nc];
    int i,j;
    for(i=0;i<nr;i++)
    {
        for(j=0;j<nc;j++)
        {
            ddr[i][j]=in.nextInt();
        }
    }
    for (i=0;i<nr;i++)
    {
            int SRE=0;
            for (j=0;j<nc;j++) 
            {
                SRE+=ddr[i][j];
            }
            System.out.println("Sum of Row " + (i + 1) + ": " +SRE);
    }
    System.out.println("Printing Array");
    for(i=0;i<nr;i++)
    {
        for(j=0;j<nc;j++)
        {
            for(i=0;i<nr;i++)
            {
               System.out.print(ddr[i][j]+"     ");
            }
            System.out.println();
        }
    }
}
}