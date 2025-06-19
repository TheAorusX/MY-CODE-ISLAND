import java.util.*;
class OddFactoSumerVrsFor
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,n,S=0;
        System.out.println("Enter Number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                if(i%3==0)
                {
                   S=S+i; 
                }
            }
        }
        System.out.println("Sum of Odd Factors of number="+S);
    }
}