import java.util.*;                           
class BinaryOP
{
    public static void main()
    {
    Scanner in=new Scanner(System.in);
    int a[]=new int[10];
    int i;
    int f;
    System.out.println("Enter 10 numbers");
    for( i=0;i<10;i++)
    {
        a[i]=in.nextInt();
    }
    int g=a[0];
    for(i=1;i<10;i++)
    {
        if(a[i]>g)
        {
            g=a[i];
            f=i+i;
        }
    }
    }
}
