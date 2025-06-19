import java.util.Scanner;
class Seconds{
    /**Wap to accept and input a number of seconds and display the number of hours, numbers and seconds.*/
    public static void main()
    {
        Scanner input = new Scanner(System.in);
        int secs= input.nextInt();
        String formatted= (secs/3600)+" and "+(secs%3600)/60+" minuits "+(secs%3600)%60+" seconds ";
        System.out.println("Input in seconds: "+secs);
        System.out.println("Seconds in 'Hours, minuits and seconds': "+formatted);
    }
}