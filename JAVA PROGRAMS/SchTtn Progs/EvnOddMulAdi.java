import java.util.*;
class EvnOddMulAdi
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,n,M=1,S=0;
        System.out.println("Enter Number");
        n=in.nextInt();
        System.out.println("Number entered= "+n);
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
               if(i%2==0)
               {
                   M=M*i;
               }
               if(i%3==0)
               {
                   S=S+i;
               }
            }
        }
        System.out.println("Product of even factors= "+M);
        System.out.println("Sum of odd factors= "+S);
    }
}