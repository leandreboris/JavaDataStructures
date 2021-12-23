package binaryTree;

public class Node {
	Node left, right;
	int content;

	public Node(int data) {
		this.content = data;
	}

	public void insert(int value) {

		if (value <= content) {
			if (left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
		}
	}
	
	public boolean contains(int value) {
		if(value == content) {
			return true;
		} else if (value < content) {
			if(left == null) {
				return false;
			}else { 
				left.contains(value);
			}
		} else {
			if(right == null) {
				return false;
			} else {
				return right.contains(value);
			}
		}
		return false;	
		
	}
	
	public void printInOrder() {
		if(left != null) {
			left.printInOrder();
		}
		System.out.println(content);
		
		if(right != null) {
			right.printInOrder();
		}
	}

}
