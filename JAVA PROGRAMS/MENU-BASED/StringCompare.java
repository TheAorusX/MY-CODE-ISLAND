package String_Programs;

import java.util.*;
class StringCompare
{
    public static void main()
    {
         Scanner in=new Scanner(System.in);
         String s1,s2,s11,s22;
         System.out.println("Enter string 1");
         s1=in.nextLine();
         System.out.println("Enter string 2");
         s2=in.nextLine();
         s11=s1.toLowerCase();
         s22=s2.toLowerCase();
         int Cmp=s11.compareTo(s22);
         System.out.println("Comparing completed printing result: "+Cmp);
    }
}