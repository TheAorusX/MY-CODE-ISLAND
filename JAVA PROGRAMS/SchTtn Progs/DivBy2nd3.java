import java.util.*;
class DivBy2nd3
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Limit of numbers in check list");
        int n=in.nextInt();
        int a[]=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0 && a[i]%3==0)
            {
                System.out.println("");
            }
        }
    }
}