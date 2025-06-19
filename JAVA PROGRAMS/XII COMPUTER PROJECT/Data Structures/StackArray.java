import java.util.*;
public class StackArray {
    int[] stack;
    int top, size;

    StackArray(int size) {
        stack = new int[size];
        top = -1;
        this.size = size;
    }

    void push(int value) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value);
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped " + stack[top--]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackArray stack = new StackArray(5);

        int choice, value;
        do {
            System.out.println("1. Push 2. Pop 3. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 3);
    }
}
