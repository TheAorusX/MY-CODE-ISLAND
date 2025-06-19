import java.util.*;
class GrossFinder
{
        public static void main()
        {
        Scanner in = new Scanner(System.in);
        int bs;
        double gs,DA,SA;
        System.out.println("Enter your basic salary");
        bs = in.nextInt();
        if(bs<=10000)
        {
            DA=(bs*10)/100;
            SA=(bs*5)/100;
        }
        else if(bs>10000 && bs<=20000)
        {
            DA=(bs*12)/100;
            SA=(bs*8)/100;
        }
        else if(bs>=20001 && bs<=30000)
        {
            DA=(bs*15)/100;
            SA=(bs*10)/100;
        }
        else
        {
            DA=(bs*20)/100;
            SA=(bs*12)/100;
        }
        gs=bs+DA+SA;
        System.out.println("AD% applied="+DA);
        System.out.println("SA% applied="+SA);
        System.out.println("Your gross salary is="+gs);
        System.out.println("Thank you for running me🙂");
        System.out.println("Credits-𝓐𝔂𝓪𝓪𝓷 𝓚𝓪𝔃𝓲");
}
}