import java.util.*;
class DigiSum
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int N,S;
        System.out.println("Enter Number");
        N=in.nextInt();
        DigiSum ob=new DigiSum();
        S=ob.Dig(N);
        System.out.println("The Sum of Digits of number is :"+S);
    }
    public int Dig(int n)
    {
        if(n==0)
        return 0;
        else
        return ((n%10)+Dig(n/10));
    }
    
}