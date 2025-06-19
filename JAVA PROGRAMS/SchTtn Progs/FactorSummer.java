import java.util.*;
class FactorSummer
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i , n ;
        System.out.println("Enter a number;)");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                    System.out.println("1");
            }
            else
            {
                System.out.println("0");    
                
            }
        }
    }
}