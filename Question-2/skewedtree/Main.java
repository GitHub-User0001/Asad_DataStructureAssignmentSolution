package skewedtree;


public class  Main{
		

	public Node node;
	public Node prevNode = null;
	public Node headNode = null;
		
	public void processBST(Node root)
		
	{
			if(root == null)
			{
				return;
			}
			processBST(root.left);
			Node rightNode = root.right;
			
			if(headNode == null)
			{
				headNode = root;
				root.left = null;
				prevNode = root;
			}
			else
			{
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
			processBST(rightNode);
		}
		

    	public void traverse(Node root)
			{
				if (root == null)
				{
					return;
				}
				System.out.println(root.val + " ");
				traverse(root.right);
			}
}
		
