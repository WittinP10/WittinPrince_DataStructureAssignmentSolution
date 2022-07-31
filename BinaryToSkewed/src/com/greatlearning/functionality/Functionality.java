package com.greatlearning.functionality;


import java.util.LinkedList;


import com.greatlearning.model.Node;

public class Functionality extends Node {

	 public LinkedList<Node> list = new LinkedList<>();

	

	public int i = 0;

	public void storeInList(Node root) {

		if (root == null) {

			return;
		} else {

			storeInList(root.left);
			//System.out.println(root.key);
			list.add(i, root);
			i++;
			storeInList(root.right);
		}

	}

	
	

	public int j = 0;

	public Node insertToSkewed(LinkedList<Node> list, Node root) {

		Node current;

		while (j < list.size() - 1) {

			current = list.get(j);
			current.left = null;
			current.right = list.get(j + 1);
			j++;

		}

		list.get(j).left = null;
		list.get(j).right = null;

		return list.get(0);
	}
	
	
	
}
