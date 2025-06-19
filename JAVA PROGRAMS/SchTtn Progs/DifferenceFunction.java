import java.util.*;
class DifferenceFunction
{
    public static void Difference()
    {
        Scanner in=new Scanner(System.in);
        int n1,n2,D=0;
        n1=in.nextInt();
        n2=in.nextInt();
        D=Math.abs(n1-n2);
        System.out.println("Difference="+D);
    }
    public static void main()
    {
        System.out.println("Enter two number to find their difference");
        Difference();
    }
}