import java.util.*;
class GreatestDigit
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int d1, d2, d3, d4,d,r,r1,G=0;
        System.out.println("Enter A Four Digit Number");
        int n=in.nextInt();
        if(n>1000 && n<=9999)
        {
            d1=n/1000;
            d=n%1000;
            d2=d/100;
            r=(d1*10+d2)*100;
            r1=n-r;
            d3=r1/10;
            d4=r1-(d3*10);
            if(d1>d2 && d1>d3 && d1>d4)
            {
            G=d1;
            System.out.println(d1+" Is the greatest Digit");
            }
            if(d2>d1 && d2>d3 && d2>d4)
            {
            G=d2;
            System.out.println(d2+" Is the greatest Digit");
            }
            if(d3>d2 && d3>d1 && d3>d4)
            {
            G=d3;
            System.out.println(d3+" Is the greatest Digit");
            }
            if(d4>d2 && d4>d3 && d4>d1)
            {
            G=d4;
            System.out.println(d4+" Is the greatest Digit"); 
            }
            else
            System.out.println("ERROR! DIGITS REPEATED");
        }
        else
        System.out.println("Bloody!  Input A FOUR DIGIT NUMBER");
    }
}