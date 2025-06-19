import java.util.*;
class FactoExtracWhileLoop
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i=1,n,f;
        System.out.println("Enter number");
        n=in.nextInt();
        System.out.println("Factors of the number ar printed bellow");        
        while(i<=n)
        {
           if(n%i==0) 
           {
               System.out.print(i+",");
               i++;
           }
        }
    }
}