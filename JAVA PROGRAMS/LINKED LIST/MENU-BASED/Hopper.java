package String_Programs;
import java.util.*;
class Hopper
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        char ch1,ch2;
        String s1,s2,S1,S2;
        int l1,l2,i,j,C=0;
        System.out.println("Enter String 1");
        s1=in.nextLine();
        l1=s1.length();
        System.out.println("Enter String 2");
        s2=in.nextLine();
        l2=s2.length();
        if(l1>l2)
        {
            for (i=l2;i<=l1;i++)
            {
                s2=" "+s2;
            }
        }
        if(l2>l1)
        {
            for (i=l1;i<=l2;i++)
            {
                s1=" "+s1;
            }
        }
        S1=s1.toUpperCase();
        S2=s2.toUpperCase();
        if(l1==l2)
        {
            for(j=0;j<l1;j++)
            {
                ch1=S1.charAt(j);
                ch2=S2.charAt(j);
                if(ch1!=ch2)
                    C++;
            }
        }
        System.out.println("String 1:"+s1+" Length :"+l1);
        System.out.println("String 2:"+s2+" Length :"+l2);
        System.out.println("Hopping Distance Between The Strings is :"+C);
    }
}