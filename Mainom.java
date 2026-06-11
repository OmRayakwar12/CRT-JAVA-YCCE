import java.util.*;
public class Mainom {
    public static void main(StringOm[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter stack capacity: ");
        int capacity = scanner.nextInt();
        Stack s = new Stack(capacity);

        boolean running = true;
        while (running) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int value = scanner.nextInt();
                    s.push(value);
                    break;
                case 2:
                    int popped = s.pop();
                    if (popped != -1) {
                        System.out.println("Popped element: " + popped);
                    }
                    break;
                case 3:
                    int topElement = s.peek();
                    if (topElement != -1) {
                        System.out.println("Top element is: " + topElement);
                    }
                    break;
                case 4:
                    s.display();
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