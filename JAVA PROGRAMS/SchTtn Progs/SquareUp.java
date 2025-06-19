import java.util.*;
class SquareUp
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
            S=(int)Math.pow(i,2);
            System.out.print(S+",");
        }
    }
}