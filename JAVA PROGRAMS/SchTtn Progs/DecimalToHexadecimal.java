import java.util.*;
class DecimalToHexadecimal
{
    public static void main()
{
    Scanner in=new Scanner(System.in);
    int N,Q=1,R;
    System.out.println("Enter Number");
    N=in.nextInt();
    while(Q!=0)
    {
        Q=(int)(N/16);
        R=(int)(N%16);
        System.out.println(N+"÷16="+"Q   "+Q+"  "+"R   "+R);
        N=Q;
}
}
}
