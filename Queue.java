public class Queue {
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        queue = new int[capacity];
        front = 0;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow!");
            return;
        }
        rear++;
        queue[rear] = data;
        System.out.println(data + " enqueued (pushed) to queue.");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow!");
            return -1;
        }
        int data = queue[front];
        front++;
        return data;
    }

    public int peekfront() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return -1;
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
            return;
        }
        System.out.print("Queue Elements (Front to Rear): ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}