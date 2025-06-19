import java.util.*;
class ArmstrongFinder
{
    public static void main()
    {
       Scanner in= new Scanner(System.in);
       int i,d=0,s=0,n;
       System.out.println("Enter A Number");
       n=in.nextInt();
       for(i=n;i>0;i=i/10)
       {
           d=d%10;
           s=s+d;
           
       }
       
    }
}