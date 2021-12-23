package linkedList;

public class Node {

	Node next;
	int content;

	public Node(int data) {
		this.content = data;
	}

	public void append(int data) {
		Node current = this;

		while (current.next != null) {
			current = current.next;
		}

		current.next = new Node(data);
	}

	public boolean contains(int value) {
		Node current = this;
		while (current.next != null) {
			if (current.content == value) {
				return true;
			}

			current = current.next;
		}

		return false;
	}

}
