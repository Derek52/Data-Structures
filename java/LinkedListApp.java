public class LinkedListApp {
	public static void main(String[] args) {
		LinkedList<Integer> linkedList = new LinkedList<Integer>();

		for (int i = 10; i > 0; i--){
			linkedList.addFirst(i);
		}

		System.out.println("Printing List after adding 1-10");
		linkedList.displayLinkedList();

		linkedList.addLast(17);
		System.out.println("Add 17 to end of the list");
		linkedList.displayLinkedList();

		System.out.println("Remove the first element in the list");
		linkedList.removeFirst();
		linkedList.displayLinkedList();
	}
}
