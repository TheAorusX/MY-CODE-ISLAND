import java.util.*;
class Sheeeet
{
    int calfact(int x)
    {
        int f=1,i;
        for(i=1;i<=x;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int n,f,d,sum=0;
        System.out.println("Enter a no.");
        n=in.nextInt();
        Sheeeet ob=new Sheeeet();
        while(n>0)
        {
            d=n%10;
            f=ob.calfact(d);
            sum=sum+f;
            n=n/10;
        }
        System.out.println("Fact="+sum);
    }
}