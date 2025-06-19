import java.util.*;
class StringOp {
    String str, msk, nstr;
    public StringOp() {
        str = "";
        msk = "";
        nstr = "";
    }

    public void accept() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter A String");
        str = in.nextLine();
        msk = in.nextLine();
        msk = msk.toLowerCase();
    }

    public void form() {
        int a = str.length();
        int b = msk.length();
        for (int i = 0; i < a; i++) {
            int fr = 0;
            char c1 = str.charAt(i);
            if (msk.indexOf(c1) == -1)
                nstr = nstr + c1;
        }
    }
    public void display()
    {
        System.out.println("Original String "+str);
        System.out.println("Masked String "+nstr);
    }
    public static void main(String[] args) {
        StringOp ob=new StringOp();
        ob.accept();
        ob.form();
        ob.display();
    }
}
