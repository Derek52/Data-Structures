class LinkedList<T> {
	var first : Node<T>? = null

	fun addFirst(nodeData : T) {
		val newNode = Node(nodeData)
		newNode.next = first
		first = newNode
	}

	fun addLast(nodeData : T) {
		val newNode = Node(nodeData)
		var current = first
		while (current?.next != null) {
			current = current.next
		}
		current?.next = newNode;
	}

	fun removeFirst() : Node<T> {
		if (first == null) {
			println("Linked List Is empty")
			throw RuntimeException()
		}
		val tempNode = first
		first = tempNode!!.next
		return tempNode
	}

	fun displayList() {
		var nodeToDisplay = first
		while(nodeToDisplay != null) {
			nodeToDisplay.displayNode()
			if (nodeToDisplay.next != null) {
				nodeToDisplay = nodeToDisplay.next
			} else {
				return
			}
		}
		println()
	}
}
