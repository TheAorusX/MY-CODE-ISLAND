import java.util.*;
class SlashMod
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number");
        int n=in.nextInt();
        while(n!=0)
        {
        int v=n%10;
        System.out.println(v);
        }
    }
}