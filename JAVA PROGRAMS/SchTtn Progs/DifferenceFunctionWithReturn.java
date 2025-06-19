import java.util.*;
class DifferenceFunctionWithReturn
{
    public static int Difference(int n1 ,int n2)
    {
        return n1-n2;
    }
    public static void main()
    {
        Scanner in=new Scanner (System.in);
        int a,b;
        System.out.println("Enter two number to find their difference");
        a=in.nextInt();
        b=in.nextInt();
        int D=Difference(a,b);
        System.out.println("Difference="+D);
    }
}
