import java.util.*;
class PrimeNum
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int P,n;
        System.out.println("Enter A Number");
        n=in.nextInt();
        P=prime(n);
        if(P==1)
        System.out.println(n+" Is A Prime Number");
        else
        System.out.println(n+" Is Not A Prime Number");
    }
    public static int prime(int x)
    {
        int P,i,C=0;
        for(i=1;i<=x;i++)
        {
            if(x%i==0)
            C++;
        }
        if(C==2)
        return P=1;
        else
        return P=0;
        
    }
}