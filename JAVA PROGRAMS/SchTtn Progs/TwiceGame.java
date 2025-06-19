import java.util.*;
class TwiceGame
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,S=0 ,t=1 ,n;
        System.out.println("Enter the limit");
        n=in.nextInt();
        for(i=1 ; i<=n ;i=i+1)
        {
            S=S+i;
            t=t*S;
            System.out.print(t);
        }
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
        }