import java.util.*;
class BrokenIntoPieces
{
    public static void main()
{   
    Scanner in = new Scanner (System.in);
    int i,n,S=0;
    System.out.println("Enter Number");
    n=in.nextInt();
    for(i=1;i<=n;i++)
    {
    if(n%i==0)
    {
        if(i%2!=0)
        S=S+i;
    }
    }
    System.out.print("Sum of odd factors of number "+n+" is ="+S);
    System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
}
}