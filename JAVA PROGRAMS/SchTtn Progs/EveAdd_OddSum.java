 import java.util.*;
class EveAdd_OddSum
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[10];
        int i,ES=0,OS=0;
        System.out.println("Enter 10 numbers");
        for(i=0;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        for(i=0;i<10;i++)
        {
            if(a[i]%2==0)
            ES+=a[i];
            else
            OS+=a[i];
        }
        System.out.println("Sum of all even numbers entered:"+ES);
        System.out.println("Sum of all odd numbers entered:"+OS);
    }
}