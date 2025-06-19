import java.util.*;
class FactorFinderNdSumer
{
    public static void main ()
    {
        Scanner in = new Scanner (System.in);
        int i=1 ;
        int n ;
        int S=0 ;
        System.out.println("Enter Number");
        n=in.nextInt();
        System.out.println("Number Entered="+n);
        while(i<=n)
        {
            if(n%i==0)
            {
                System.out.println(i);
                S=S+i;
            }
            i++;
        }
        System.out.println("Sum of factors of number is= "+S);
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
}