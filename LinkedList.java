class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList {
    private Node head; 

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode;      
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL"); 
    }
}

public class LinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();

        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();
    }
}
 