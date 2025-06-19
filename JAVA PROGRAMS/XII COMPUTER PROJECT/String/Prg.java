import java.util.*;
class Prg 
{
    String str;
    public Prg()
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter A Sentence");
        str=in.nextLine();
    }
    public void display()
    {
        str=str+" ";
        int L=str.length();
        int i;
        String wd="";
        for(i=0;i<L;i++)
        {
            char ch=str.charAt(i);
            if(ch!=' ')
            wd=wd+ch;
            else if (ch==' ')
            {
                int F=frequency(wd);
                System.out.println("Word: "+wd+" Frequency: "+F);
                wd="";
            }
        }
    }
    public int frequency(String W)
    {
        int i;
        int C=0;
        int WL=W.length();
        for(i=0;i<(WL-1);i++)
        {
            int A=(int)W.charAt(i);
            int B=(int)W.charAt((i+1));
            if((B-A)==1)
            C++;
        }
        return C;
    }
    public static void main(String[]Args)
    {
        Scanner in=new Scanner(System.in);
        Prg ob=new Prg();
        ob.display();
    }
}