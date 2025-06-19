import java.util.*;
class Decosta
{
    public static void  main()
    {
        Scanner in = new Scanner (System.in);
        int i=1,n,S=0;
        double Avg;
        System.out.println("Enter Number");
        for(i=1 ;i<=10;i++)
        {
            n=in.nextInt();
            if(n%2==0)
            {
                S=S+n;
            }
            n++;
        }
        System.out.println("Sum of all even numbers is="+S);
        System.out.println("Average of all even numbers is="+(S/10));
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
}