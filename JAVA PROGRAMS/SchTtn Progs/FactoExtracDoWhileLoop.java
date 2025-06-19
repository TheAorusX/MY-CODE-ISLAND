import java.util.*;
class FactoExtracDoWhileLoop
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i=1,n=10,f;
        System.out.println("Enter number");
        n=in.nextInt();
        System.out.println("Factors of the number ar printed bellow");        
        do
        {
            if(n%i==0)
            System.out.print(i+",");
            i++;
        }
        while(i<=n);
    }
}
