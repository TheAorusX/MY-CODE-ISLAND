import java.util.*;
class ThreeDigitNum
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int d1,d2,d3,n,r,S;
        double avg;
        System.out.println("Enter A Three Digit Number");
        n=in.nextInt();
        if(n>=100 && n<=999)
        {
;           d1=n/100;
            r=n%100;
            d2=r/10;
            d3=r%10;
            S=d1+d2+d3;
            avg=(d1+d2+d3)/3;
            System.out.println("Sum of digits="+S);
            System.out.println("Average of digits="+avg);
        }
        else
        System.out.println("INPUT A THREE DIGIT NUMBER YOU BLOODY IDIOT !!!");
    }
}