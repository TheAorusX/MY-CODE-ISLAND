import java.util.*;
class ActObtRhtTriangle
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a1,a2,a3,S=0;
        System.out.println("Enter the angles of triangle");
        a1=in.nextInt();//angle one
        a2=in.nextInt();//angle two
        a3=in.nextInt();//angle three
        S=a1+a2+a3;
        if(S==180)
        {
            System.out.println("It is a triangle");
        }
        else
        {
            System.out.println("It is not a triangle");
        }
        if (a1<90 && a2<=90 && a3<=90)
        {
            System.out.println("It is an acute angle triangle");
        }
        else if(a1==90 || a2==90 || a3==90)
        {
            System.out.println("It is a right angle triangle");
        }
        else
        {
            System.out.println("It is an obtuse angle triangle");
        }
    }
}