fun main(args : Array<String>) {
	val linkedList = LinkedList<Int>()

	linkedList.removeFirst()
	for (i in 10 downTo 1) {
		linkedList.addFirst(i.toInt())
	}

	println("Added numbers 10-1 to start of list")
	linkedList.displayList()

	println("Added 17 to end of list")
	linkedList.addLast(17.toInt())
	linkedList.displayList()

	println("removeFirst from list")
	linkedList.removeFirst()
	linkedList.displayList()

}
