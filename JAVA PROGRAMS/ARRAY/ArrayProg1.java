import java.util.*;
class ArrayProg1
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[10];
        int i;
        System.out.println("Enter 10 numbers");
        for(i=1;i<10;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Reversing Loop...");
        for(i=9;i>0;i--)
        {
            System.out.println(a[i]);
        }
    }
}