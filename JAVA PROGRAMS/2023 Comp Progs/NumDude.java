import java.util.*;
class NumDude
{
    int num;
    public NumDude()
    {
        num=0;
    }
    public void input()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number");
        num=in.nextInt();
    }
    public int sumDigits(int x)
    {
        int sum=0;
        while(x>0)
        {
            int d=x%10;
            sum=sum+d;
            x=x/10;
        }
        return sum;
    }
    public void isDude()
    {
        int n=(int)Math.pow(sumDigits(num),3);
        if(num==n) 
        System.out.println(num+" Is A Dudenney Number");
        else 
        System.out.println(num+" Is Not A Dudenney Number");
    }
    public static void main(String[] args)
    {
        NumDude ob=new NumDude();
        ob.input();
        ob.isDude();
    }
}   