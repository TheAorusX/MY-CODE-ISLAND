import java.util.*;
class OddFactorFrequency
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,n,S=0;
        System.out.println("Enter Number");
        n=in.nextInt();
        System.out.println("Odd factors of the number "+n+"Are  Printed bellow");
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(i%3==0)
                {
                    System.out.print(i+" , ");
                }
            }
        }
    }
}
