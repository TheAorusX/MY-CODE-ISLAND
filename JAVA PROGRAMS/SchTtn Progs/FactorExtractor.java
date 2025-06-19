import java.util.*;
class FactorExtractor
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=1;i<+n;i++)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
        }
    }
}