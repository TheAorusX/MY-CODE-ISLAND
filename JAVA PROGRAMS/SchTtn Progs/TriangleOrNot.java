import java.util.*;
class TriangleOrNot
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        int a1,a2,a3,S=0;
        System.out.println("Enter the angles of triangle");
        a1=in.nextInt();
        a2=in.nextInt();
        a3=in.nextInt();
        S=a1+a2+a3;
        if(S==180)
            System.out.println("It is a triangle");
        else
            System.out.println("It is not a triangle");
    }
}