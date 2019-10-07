public class Stack<T> {
	private int capacity = 50;

	private int index = -1;

	private T[] stack;

	public Stack() {
		stack = (T[])new Object[capacity];
	}

	public void push(T data) {
		stack[++index] = data;
	}

	public T pop() {
		return stack[index--];
	}

	public boolean isEmpty() {
		if (index == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int size() {
		return index + 1;
	}

	public T peek() {
		return stack[index];
	}
}
