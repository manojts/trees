import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Node
	{
		public int data;
		public Node left;
		public Node right;
		
		public Node()
		{
			
		}
		public Node(int data)
		{
			this.data = data;
			this.left = null;
			this.right = null;
		}
		public Node BuildTree(Node root)
		{
			root.left = new Node(2);
			
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			
			root.left.right.left = new Node(7);
			
			root.right = new Node(3);
			root.right.right = new Node(6);
			return root;
		}
		
		public void Preorder(Node root)
		{
			//Root
			// Left Subtree
			// Right Subtree
			if(root == null)
				return;
			System.out.print(root.data+"\t");
			Preorder(root.left);
			Preorder(root.right);
			
		}
		public void Inorder(Node root)
		{
			// Left Subtree
			// Root
			// Right Subtree
			if(root == null)
				return;
			Inorder(root.left);
			System.out.print(root.data+"\t");
			Inorder(root.right);
			
		}
		public void Postorder(Node root)
		{
			// Left Subtree
			// Right Subtree
			// Root
			if(root == null)
				return;
			Inorder(root.left);
			Inorder(root.right);
			System.out.print(root.data+"\t");
			
		}
		public void LevelOrder(Node root)
		{
			// Run BFS on the tree
			Queue<Node> queue = new LinkedList<Node>();
			queue.add(root);
			
			while(!queue.isEmpty())
			{
				int size = queue.size();
				for(int i=0;i<size;i++)
				{
					Node temp = queue.poll();
					System.out.print(temp.data+"\t");
					if(temp.left != null)
						queue.add(temp.left);
					if(temp.right != null)
						queue.add(temp.right);
				}
				System.out.println();
			}
		}

		public int treeHeight(Node root)
		{
			if(root == null)
				return 0;
			int h1 = treeHeight(root.left);
			int h2 = treeHeight(root.right);
			return (1 + Integer.max(h1, h2));
			
		}
	}
