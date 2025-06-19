//OUTPUT SHOULD BE ALL EVEN
import java.util.*;
class SeriesEVEN
{
    public static void main ()
    {
        Scanner in = new Scanner(System.in);
        int i ,S=0 , n;
        System.out.println("NOTE:Output should consist of Even Numbers Only");
        System.out.println("Enter Limit");
        n = in.nextInt();
        System.out.println("Limit entered="+n);
        for(i=1 ; i<=n ; i++ )
        {
            S=i;
            if(S%2==0)
            System.out.print(S+",");
            else
            continue;
        }
System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
            }
}