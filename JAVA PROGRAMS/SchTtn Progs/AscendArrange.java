import java.util.*;
class AscendArrange
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a[]=new int[5];
        int i,j,t;
        System.out.println("Enter 5 numbers");
        for(i=0;i<5;)
        {
            a[i]=in.nextInt();
            i++;
        }
        for(i=0;i<5;i++)
        {
            for(j=0;i<4;j++)
            {
                if(a[i]>a[i+1])
                {
                    t=a[i];
                    a[i]=a[i+1];
                    a[i+1]=t;
                }
            }
        }
        System.out.println("Printing...");
        for(i=0;i<5;i++)
        {
            System.out.println(a[i]);
        }
    }
}
