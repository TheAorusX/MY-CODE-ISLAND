import java.util.*;
class FactorialFinder
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=in.nextInt();
        int num=n;
        int d,S=0,P;
        while(n!=0)
        {
            d=n%10;
            P=1;
            for(int i=1;i<=d;i++)
            {
                P=P*i;
            }
            S=S+P;
            n=n/10;
        }
        
        
    }
}