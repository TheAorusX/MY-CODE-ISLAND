import java.util.*;
class Sumer
{
    int S=0;
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Lower Limit");
        System.out.println("The program gives sum of the intermediate number between upper and lower limit");
        int L=in.nextInt();
        int U=in.nextInt();
        Sumer ob=new Sumer();
        System.out.println("Sum of numbers in series :"+ob.Summ(L,U));
    }
    public int Summ(int l,int u)
    {
        if(l>=u)
        return S;
        else
        return u+Summ(l,(u-1));
    }
}