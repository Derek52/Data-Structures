fun main(args : Array<String>) {
	val stack = Stack()

	println("push 17 onto stack")
	stack.push(17)

	println(stack.peek())

	println("push 21 onto stack")
	println("push 194 onto stack")
	stack.push(21)
	stack.push(194)
	
	val stackSize = stack.size()
	for (i in 1..stackSize) {
		println(stack.pop())
	}
}
