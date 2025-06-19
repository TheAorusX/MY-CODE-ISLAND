import java.util.Scanner;
class Prog25{
    public static void main(){
        String name;
        System.out.println("Please enter your name");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Wellcome"+name);
    }
}