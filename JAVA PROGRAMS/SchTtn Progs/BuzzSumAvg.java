import java.util.*;
class BuzzSumAvg
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n,i,S=0,f=0,Avg;
        System.out.println("Enter Fifteen Numbers");
        for(i=1;i<=15;i++)
        {
            n=in.nextInt();
            if(n%7==0 || n/10==7)
            {
                S=S+i;
                f++;
            }
        }
        Avg=S/f;
        System.out.println("Sum of all buzz numbers ="+S);
        System.out.println("Frequency of buzz number"+f);
        System.out.println("Average of all buzz number ="+Avg);        
    }
}