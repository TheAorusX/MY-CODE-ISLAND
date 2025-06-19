import java.util.*;
class FunctionPerfect
{
    public static void main()
    {
        System.out.println("Enter The Number");
        Perfect();
    }
    public static void Perfect()
    {
        Scanner in=new Scanner(System.in);
        int i,n,S=0;
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                S=S+i;
            }
        }
        if(S==n)
            System.out.println("It is a Perfect Number");
            else
            System.out.println("It is not a Perfect Number");
    }
}