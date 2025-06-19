import java.util.Scanner;
class BokhlaGyaN
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i , S=1 , T=0, n;
        System.out.println("Enter Limit");
        n=in.nextInt();
        for(i=1 ;i<=n ; i++)
        {
            S=S*i;
            T=T+S;
            System.out.print(S+""+",");
        }
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
}