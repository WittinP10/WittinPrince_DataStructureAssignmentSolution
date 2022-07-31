package com.greatlearning.model;

public class Node {

	public int key;
	public Node left, right;

	public Node() {
		left = right = null;
	}
	
	
	public Node createNode(int key) {

		Node temp = new Node();

		temp.key = key;

		return temp;

	}
	
	public Node insertNode(Node root, int key) {

		if (root == null) {

			root = createNode(key);

			return root;
		} else if (root.key < key) {

			root.right = insertNode(root.right, key);

		} else {

			root.left = insertNode(root.left, key);
		}

		return root;

	}
	
	public void inorderTraversal(Node root) {
		
		if(root==null) {
			
			return;
		}else {
			
			inorderTraversal(root.left);
			System.out.print(root.key+" ");
			inorderTraversal(root.right);
		}
		
	}
	
	
	
	

}
