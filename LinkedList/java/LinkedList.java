public class LinkedList<T> {
	private Node<T> first;


	public LinkedList() {
		first = null;
	}

	public void addFirst(T data) {
		Node<T> newNode = new Node<T>(data);
		newNode.next = first;
		first = newNode;
	}

	public void addLast(T data) {
		Node<T> newNode = new Node<T>(data);
		Node<T> current = first;

		while(current.next != null){
			current = current.next;
		}

		current.next = newNode;
	}


	public Node removeFirst() {
		if (first == null){
			System.out.println("Linked List is Empty");
			throw new RuntimeException();
		}
		Node<T> tempNode = first;
		first = first.next;
		return tempNode;
	} 

	public void displayLinkedList() {
		System.out.println("Linked List Contents");
		Node nodeToDisplay = first;
		while(nodeToDisplay != null) {
			nodeToDisplay.displayNode();
			nodeToDisplay = nodeToDisplay.next;
		}
		System.out.println();
	}
}
