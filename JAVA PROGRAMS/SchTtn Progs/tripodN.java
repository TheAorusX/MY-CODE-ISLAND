import java.util.*;
class tripodN
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,S=0,t=0, n ;
        System.out.println("Enter Limit");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            S=S+1;
            t=t+S;
            System.out.print(t+" ");
        }
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
}