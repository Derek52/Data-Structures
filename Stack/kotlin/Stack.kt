//Unlike the Java Stack, this is a stack for Ints only, it isn't generic. The code for that was a little too inovlved for me at the moment
class Stack() {

	val capacity : Int = 50

	var index : Int = -1

	val stack = IntArray(capacity)

	fun push(input : Int) {
		stack[++index] = input;
	}

	fun pop() : Int{
		return stack[index--]
	}

	fun peek() : Int {
		return stack[index]
	}

	fun isEmpty() : Boolean {
		if (index == 0) {
			return true
		} else {
			return false
		}
	}

	fun size() : Int {
		return index + 1
	}
}
