import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor to initialize the attributes
    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to add two Time objects
    public Time addTime(Time t) {
        int newSeconds = this.seconds + t.seconds;
        int newMinutes = this.minutes + t.minutes;
        int newHours = this.hours + t.hours;

        // Adjust for overflow in seconds
        if (newSeconds >= 60) {
            newMinutes += newSeconds / 60;
            newSeconds = newSeconds % 60;
        }

        // Adjust for overflow in minutes
        if (newMinutes >= 60) {
            newHours += newMinutes / 60;
            newMinutes = newMinutes % 60;
        }

        // Adjust for overflow in hours
        if (newHours >= 24) {
            newHours = newHours % 24;
        }

        // Return the new Time object
        return new Time(newHours, newMinutes, newSeconds);
    }

    // Method to display the time
    public void displayTime() {
        System.out.printf("Time: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the first time object
        System.out.print("Enter hours for the first time: ");
        int hours1 = scanner.nextInt();
        System.out.print("Enter minutes for the first time: ");
        int minutes1 = scanner.nextInt();
        System.out.print("Enter seconds for the first time: ");
        int seconds1 = scanner.nextInt();

        // Creating the first Time object
        Time time1 = new Time(hours1, minutes1, seconds1);

        // Taking user input for the second time object
        System.out.print("Enter hours for the second time: ");
        int hours2 = scanner.nextInt();
        System.out.print("Enter minutes for the second time: ");
        int minutes2 = scanner.nextInt();
        System.out.print("Enter seconds for the second time: ");
        int seconds2 = scanner.nextInt();

        // Creating the second Time object
        Time time2 = new Time(hours2, minutes2, seconds2);

        // Displaying both times
        System.out.println("\nFirst Time:");
        time1.displayTime();
        System.out.println("Second Time:");
        time2.displayTime();

        // Adding the two times
        Time totalTime = time1.addTime(time2);

        // Displaying the total time after addition
        System.out.println("\nTotal Time after addition:");
        totalTime.displayTime();

        scanner.close();
    }
}
