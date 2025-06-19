import java.util.*;
class Series
{
    int x,n;
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int x,n;
        Double S=0.0;
        System.out.println("Enter value of x");
        x=in.nextInt();
        System.out.println("Enter value of n,limit of series");
        n=in.nextInt();
        Series ob=new Series();
        System.out.println("Sum of series   :"+ob.sum());
    }
    public void Series(int x,int n)
    {
        this.x=x;
        this.n=n;
    }
    public double sum()
    {
        Double S=0.0;
        int i;
        for(i=1;i<=n;i++)
        {
            S+=Math.pow(x,(n-i));
        }
        return S;
    }
}