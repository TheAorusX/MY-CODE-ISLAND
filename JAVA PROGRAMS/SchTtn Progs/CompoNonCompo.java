import java.util.*;
class CompoNonCompo

{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        int i;
        int n;
        int c=0;
        System.out.println("Enter Number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            if(n%i==0 && 1!=1)
             c++;
        }
        if(c>=2)
        {
        System.out.println(n+" Is a composite number");
        }
        else
        {
        System.out.println(n+" Is not a composite number");
        }
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
    }
    
}