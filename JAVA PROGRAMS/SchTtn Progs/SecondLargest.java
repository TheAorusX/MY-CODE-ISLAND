import java.util.*;
class SecondLargest
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,sg=0,g=0;
        System.out.println("Enter 10 numbers");
        for(i=1;i<=10;i++)
        {
            n=in.nextInt();
            if(n>g)
            {
            sg=g;
            g=n;  
            }
        }
        System.out.println("Second Largest number is="+sg);
    }
}