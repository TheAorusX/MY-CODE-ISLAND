import java.util.*;
class Bazeuhka
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int n;
        boolean B;
        System.out.println("Enter A Number");
        n=in.nextInt();
        B=Bazzu(n);
        if(B==true)
        System.out.println(n+" Is A Buzz Number");
        if(B==false)
        System.out.println(n+" Is Not A Buzz Number");
    }
    public static boolean Bazzu(int x)
    {
        if(x%7==0 || x%10==7)
        return true;
        else
        return false;
    }
}