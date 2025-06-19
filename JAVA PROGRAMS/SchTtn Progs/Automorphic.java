import java.util.*;
class Automorphic
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i , j , n , S=0 ,c , c1;
        System.out.println("Enter Number");
        n=in.nextInt();
        for(i=n ; i>0; i=i/10)
        {
            c1=i%10;
            S=S*10+c1;
        }
        for(j=S ; j>0 ; j=j/10)
        {
            c=j%10;
            if(c!=0)
            System.out.print(c+"");
            
        }
    }
}