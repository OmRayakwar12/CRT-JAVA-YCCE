class Node {
    int val; 
    Node left, right;

    Node(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

public class Tree {
    public static void main(String[] args) {
        // 1. Create the nodes
        Node root = new Node(10);
        Node node20 = new Node(20);
        Node node30 = new Node(30);
        Node node40 = new Node(40);
        Node node50 = new Node(50);

        // 2. Link the nodes to match your tree structure
        root.left = node20;
        root.right = node30;

        node20.left = node40;
        node20.right = node50;

        // Verify structure by printing the root and its children
        System.out.println("Root: " + root.val);
        System.out.println("Root Left: " + root.left.val + ", Root Right: " + root.right.val);
        System.out.println("20 Left: " + root.left.left.val + ", 20 Right: " + root.left.right.val);
    }
}
