import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Inorder: Left -> Root -> Right
    public static void inorder(Node root) {
        // TODO: Implement inorder traversal
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + ", ");
        inorder(root.right);
    }

    // Preorder: Root -> Left -> Right
    public static void preorder(Node root) {
        // TODO: Implement preorder traversal
        if (root == null) {
            return;
        }

        System.out.print(root.data + ", ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left -> Right -> Root
    public static void postorder(Node root) {
        // TODO: Implement postorder traversal
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + ", ");
    }

    // Level Order: Breadth-First Search
    public static void levelOrder(Node root) {
        // TODO: Implement level order traversal
        if (root == null) {
            return;
        }
        // Implementation for level order traversal (using a queue)
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print(current.data + ", ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }

    }

    public static void main(String[] args) {

        // Create binary tree with 15 nodes
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);

        root.left.right.left = new Node(10);
        root.left.right.right = new Node(11);

        root.right.left.left = new Node(12);
        root.right.left.right = new Node(13);

        root.right.right.left = new Node(14);
        root.right.right.right = new Node(15);

        System.out.println("Inorder Traversal:");
        inorder(root);

        System.out.println("\nPreorder Traversal:");
        preorder(root);

        System.out.println("\nPostorder Traversal:");
        postorder(root);

        System.out.println("\nLevel Order Traversal:");
        levelOrder(root);
    }
}
