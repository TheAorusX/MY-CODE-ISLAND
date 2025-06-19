import java.util.*;
class Neonese
{
    public static void neon()
    {
        Scanner in=new Scanner(System.in);
        int i,n,a,S=0;
        System.out.println("Enter A number");
        n=in.nextInt();
        a=n;
        int no=a*a;
        while(no!=0)
        {
           int b=no%10; 
           S=S+b;
           no=no/10;
        }
        if(S==n)
        System.out.println("It is a neon Number");
        else
        System.out.println("It is not a neon Number");
    }
}