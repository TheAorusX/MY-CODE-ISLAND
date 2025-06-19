import java.util.*;
class Buzznumcheck
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,S=0,f=0,avg;
        System.out.println("Enter 15 numbers");
        for(i=1;i<=15;i++)
        {
            n=in.nextInt();
            if(n%7==0 || n%10==7)
            {
                S=S+i;
                f++;
            }
            avg=S/f;
            System.out.println("Sum of all Buzz numbers is="+S);
            System.out.println("Frequency of Buzz numbers"+f);
            System.out.println("Average of all the Buzz numbers"+avg);
        }
    }
}