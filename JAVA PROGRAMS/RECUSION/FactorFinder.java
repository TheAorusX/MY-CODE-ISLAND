import java.util.*;
class FactorFinder
{
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the number");
            n = in.nextInt();
            System.out.println("Printing number of factors of " + n);
            for (int i = 1; i <= n; i++) {
                if (isFact(n, i) == 0)
                    System.out.print(i + ", ");
            }
        } finally {
            in.close();
        }
    }
    public static int isFact(int n,int x)
    {
        if(n%x==0)
        return 0;
        else
        return 1;
    }
}