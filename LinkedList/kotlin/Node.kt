class Node<T>(input : T) {

	var nodeData = input

	var next : Node<T>? = null

	fun displayNode() {
		println(nodeData)
	}
}
