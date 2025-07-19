package String_Programs;

import java.util.*;
class VolCon
{
    public static void main()
    {
        Scanner in=new Scanner(System.in);
        String sn;
        char ch;
        int i,l,V=0,C=0;
        System.out.println("Enter a sentence");
        sn=in.nextLine();
        l=sn.length();
        for(i=0;i<l;i++)
        {
            ch=sn.charAt(i);
            if(ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u')
            V++;
            else if(ch!='a' || ch!='e' ||ch!='i' ||ch!='o' ||ch!='u')
            C++;
        }
        System.out.println("Number of VOWELS in sentence: "+V);
        System.out.println("Number of CONSONENT in sentence: "+C);
}
}