import java.util.*;
public class MainQueue {
    public static void main(StringOm[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter queue capacity: ");
        int capacity = scanner.nextInt();
        Queue q = new Queue(capacity);

        boolean running = true;
        while (running) {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue (Push)");
            System.out.println("2. Dequeue (Pop)");
            System.out.println("3. Peek Front");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int value = scanner.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    int dequeued = q.dequeue();
                    if (dequeued != -1) {
                        System.out.println("Dequeued (popped) element: " + dequeued);
                    }
                    break;
                case 3:
                    int frontElement = q.peekfront();
                    if (frontElement != -1) {
                        System.out.println("Front element is: " + frontElement);
                    }
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting application.");
                    break;
                default:
                    System.out.println("Invalid choice! Please select between 1 and 5.");
            }
        }
        scanner.close();
    }
}