import java.util.*;
class Shatranj
{
    public static void main()
    {
        int i,S=0,n;
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the limit");
        n=in.nextInt();
        for( i=1; i<=n ; i++)
        {
            S=S+i;
            System.out.print(i+"+");
        }
        System.out.println();
        System.out.println("Sum : "+S);
    }
}