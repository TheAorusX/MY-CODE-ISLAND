//OUTPUT SHOULD BE ALL ODD
import java.util.*;
class SeriesODD
{
    public static void main ()
    {
        Scanner in = new Scanner(System.in);
        int i ,S=0 , n;
        System.out.println("NOTE:Output should consist of Odd Numbers Only");
        System.out.println("Enter Limit");
        n = in.nextInt();
        System.out.println("Limit entered="+n);
        for(i=1 ; i<=n ; i++ )
        {
            S=S=i;
            if(S%2!=0)
            System.out.print(S+",");
            else
            continue;
        }
System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
            }
}