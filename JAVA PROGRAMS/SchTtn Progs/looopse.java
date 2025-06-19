import java.io.*;
class looopse
{
    public static void main() throws IOException
    {
    char st;
    System.out.println("bina kisi backchodi ke ,charecter input kare");
    st= (char)System.in.read();
    if(st>='A' && st<='Z')
    {
    System.out.println(" st+ is a capital letter");
    }
    else if(st>='a' && st<='z')
    {
        System.out.println(" st+ is a small letter");
    }
    else if( st>='0' && st<='9' )
    {
        System.out.println(" st+ is a digit ");
    }
    else{
    System.out.println("ST+ to tatti hai!!");
}
}
}