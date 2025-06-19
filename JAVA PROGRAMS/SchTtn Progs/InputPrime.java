import java.util.*;
class InputPrime
{
    public static  void main()
    {
        Scanner in=new Scanner(System.in);
        int i,j,n,c=0;
        System.out.println("Enter 10 numbers");
        for(i=1;i<+0;i++)
        {
            n=in.nextInt();
            for(j=1;j<=n;j++)
            if(n%10==0)
            {
                c++;
            }
            if(c==2)
            {
                System.out.println("It is a palendrome number");
            }
            
        }
    }
}