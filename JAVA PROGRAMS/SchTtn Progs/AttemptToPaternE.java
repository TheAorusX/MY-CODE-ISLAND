import java.util.Scanner;
public class AttemptToPaternE
{
    public static void main()
    {
        System.out.println("Enter the number of rows");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i=0;i<n ;i++ )
        {
            for (int j=0;j<=n/2 ;j++ )
            {
                if (i==0||i==n-1||i==n/2||j==0)
                {
                    System.out.print("[]");
                }
                else
                {
                    System.out.print("");
                }
            }
            System.out.println();
        }
    }
}