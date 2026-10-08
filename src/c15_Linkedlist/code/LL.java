package c15_Linkedlist.code;

public class LL {

	private Node head;
	private Node tail;

	private int size;
	public LL() {
		this.size = 0;
	}
	
	public void insertFirst(int val) {
		Node node=new Node(val);
		node.next=head;
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

}
