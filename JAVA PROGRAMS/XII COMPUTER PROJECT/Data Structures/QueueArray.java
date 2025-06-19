import java.util.*;
public class QueueArray {
    int[] queue;
    int front, rear, size;

    QueueArray(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    void insert(int value) {
        if (rear == size - 1) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) front = 0;
            queue[++rear] = value;
            System.out.println("Inserted " + value);
        }
    }

    void delete() {
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
        } else {
            System.out.println("Deleted " + queue[front++]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueArray queue = new QueueArray(5);

        int choice, value;
        do {
            System.out.println("1. Insert 2. Delete 3. Exit");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    queue.insert(value);
                    break;
                case 2:
                    queue.delete();
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
