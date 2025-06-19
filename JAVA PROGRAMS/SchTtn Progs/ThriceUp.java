import java.util.*;
class ThriceUp
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i, S=0;
        double n;
        System.out.println("Enter limit");
        n=in.nextDouble();
        for(i=1;i<=n;i++)
        {
            S=i+i+i;
            System.out.print(S+",");
            
        }
    }
}