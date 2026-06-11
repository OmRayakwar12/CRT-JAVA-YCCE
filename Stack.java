

public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }

    // Push element
    public void push(int data) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow!");
            return;
        }
        stack[++top] = data;
        System.out.println(data + " pushed to stack.");
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        return stack[top--];
    }

    // Peek element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return -1;
        }
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return;
        }
        System.out.print("Stack Elements (Top to Bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}