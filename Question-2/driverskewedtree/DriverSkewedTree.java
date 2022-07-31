package driverskewedtree;

import skewedtree.Main;
import skewedtree.Node;

public class DriverSkewedTree {

	public static void main(String[] args) {
		
		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);
		
		
		tree.processBST(tree.node);
		tree.traverse(tree.headNode);
	}

}
