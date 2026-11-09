public class ValidBST {
    public static boolean isValid(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }
        if (root.data <= minVal || root.data >= maxVal) {
            return false;
        }
        return isValid(root.left, minVal, root.data) &&
                isValid(root.right, root.data, maxVal);
    }

    public static void main(String[] args) {
        boolean result = isValid(TreeNode.buildTree(), Long.MIN_VALUE, Long.MAX_VALUE);
        System.out.println("Is the tree a valid BST? " + result);
    }

}
