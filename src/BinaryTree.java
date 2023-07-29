
public class BinaryTree {
	
	public static void main(String[] args) {
		Node root = new Node(1);
		
		root = root.BuildTree(root);
		root.Preorder(root);
		System.out.println();
		root.Inorder(root);
		System.out.println();
		root.Postorder(root);
		System.out.println();
		root.LevelOrder(root);
		System.out.println();
		System.out.println("Height of Tree is "+ root.treeHeight(root));
		

	}

}
