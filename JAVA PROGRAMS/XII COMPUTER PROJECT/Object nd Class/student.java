import java.util.Scanner;

class Student {
    private String name;
    private int rollNumber;
    private double marks1;
    private double marks2;
    private double marks3;

    // Constructor to initialize the attributes
    public Student(String name, int rollNumber, double marks1, double marks2, double marks3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate and return the average marks
    public double calculateAverage() {
        return (marks1 + marks2 + marks3) / 3;
    }

    // Method to display student details and average marks
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Average Marks: " + (int)calculateAverage());
    }

    // Main method to test the class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for student details
        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the student's roll number: ");
        int rollNumber = scanner.nextInt();

        System.out.print("Enter the marks for Subject 1: ");
        double marks1 = scanner.nextDouble();

        System.out.print("Enter the marks for Subject 2: ");
        double marks2 = scanner.nextDouble();

        System.out.print("Enter the marks for Subject 3: ");
        double marks3 = scanner.nextDouble();

        // Creating a Student object with user input
        Student student = new Student(name, rollNumber, marks1, marks2, marks3);

        // Displaying student details and average marks
        student.displayDetails();

        scanner.close();
    }
}
