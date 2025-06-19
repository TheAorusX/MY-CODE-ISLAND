import java.util.*;
class Rooter
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n;
        System.out.println("Enter number to be rooted");
        n=in.nextInt();
        Double N=Math.sqrt(n);
        System.out.println("Rooted version of  "+n+"  is  "+N);
    }
}