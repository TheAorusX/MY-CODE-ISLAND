import java.util.*;
class AutomorphicFinder
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i,j,n,u,A,b,p,v;
        System.out.println("Enter Numbers");
        n=in.nextInt();
        b=n;
        A=n;
        u=A%10;
        p=b*b;
        v=p%10;
        System.out.println("Number Entered= "+n);
        System.out.println("Square of "+n+" = "+p);
        if(u==v)
        {
                System.out.println(n+" is an Automorphic Number");
        }
        else
        {
                System.out.println(n+" is not an Automorphic Number");
        }
    }
}

