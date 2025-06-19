import java.util.*;
class EvnFactoSumerVrsFor
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,S=0;
        System.out.println("Enter Number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(i%2==0)
                {
                   S=S+i; 
                }
            }
        }
        System.out.println("Sum of Even Factors of number="+S);
    }
}