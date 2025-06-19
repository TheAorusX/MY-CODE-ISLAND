import java.util.*;
class PalendromeVrsWhile
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i=1,a,b,S=0,n;
        System.out.println("Enter Number");
        n=in.nextInt();
        a=n;
        while(i>0)
        {
            b=i%10;
            S=S*10+b;
            a=a/10;
        }
        if(S==n)
        System.out.println(n+"Is a  palendrome number");
        else
        System.out.println(n+"Is a not  palendrome number");
    }
}