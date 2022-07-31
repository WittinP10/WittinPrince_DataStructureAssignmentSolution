package com.greatlearning.main;
import com.greatlearning.model.Node;
import com.greatlearning.functionality.*;

public class Main {

	public static void main(String[] args) {

		Functionality n1=new Functionality();
		Node root=null;
		
		root = n1.insertNode(root, 60);
		root = n1.insertNode(root, 20);
		root = n1.insertNode(root, 10);
		root = n1.insertNode(root, 15);
		root = n1.insertNode(root, 0);

		
		
		n1.storeInList(root);

		n1.insertToSkewed(n1.list, root);

		root = n1.insertToSkewed(n1.list, root);
		
			
		n1.inorderTraversal(root);
	}

	
	
}
