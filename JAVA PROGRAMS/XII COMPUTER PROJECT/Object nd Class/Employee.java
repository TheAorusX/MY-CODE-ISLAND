import java.util.Scanner;
class Employee {
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void calculateBonus(int performanceLevel) {
        double bonusPercentage = 0.0;
        switch (performanceLevel) {
            case 1: // Poor
                bonusPercentage = 5.0;
                break;
            case 2: // Average
                bonusPercentage = 10.0;
                break;
            case 3: // Good
                bonusPercentage = 15.0;
                break;
            case 4: // Excellent
                bonusPercentage = 20.0;
                break;
            default:
                System.out.println("Invalid performance level.");
                return;
        }
        double bonus = salary * bonusPercentage / 100;
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + salary);
        System.out.println("Performance Level: " + performanceLevel);
        System.out.println("Bonus: $" + bonus);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the employee's ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter the employee's salary: ");
        double salary = scanner.nextDouble();
        Employee employee = new Employee(name, id, salary);
        System.out.println("Performance Levels:");
        System.out.println("1. Poor");
        System.out.println("2. Average");
        System.out.println("3. Good");
        System.out.println("4. Excellent");
        System.out.print("Enter the performance level (1-4): ");
        int performanceLevel = scanner.nextInt();
        employee.calculateBonus(performanceLevel);
        scanner.close();
    }
}
