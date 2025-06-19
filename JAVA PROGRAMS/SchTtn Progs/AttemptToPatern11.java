import java.util.*;
class AttemptToPatern11
{
    public static void main(String[]ARGS)
    {
        Scanner in = new Scanner(System.in);
        int i,j,n;
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=0;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
