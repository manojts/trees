import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversal {

    // Inorder: Left -> Root -> Right
    public static void inorder(TreeNode root) {
        // TODO: Implement inorder traversal
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + ", ");
        inorder(root.right);
    }

    // Preorder: Root -> Left -> Right
    public static void preorder(TreeNode root) {
        // TODO: Implement preorder traversal
        if (root == null) {
            return;
        }

        System.out.print(root.data + ", ");
        preorder(root.left);
        preorder(root.right);
    }

    // Postorder: Left -> Right -> Root
    public static void postorder(TreeNode root) {
        // TODO: Implement postorder traversal
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + ", ");
    }

    // Level Order: Breadth-First Search
    public static void levelOrder(TreeNode root) {
        // TODO: Implement level order traversal
        if (root == null) {
            return;
        }
        // Implementation for level order traversal (using a queue)
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
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

        TreeNode root = TreeNode.buildTree();

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
