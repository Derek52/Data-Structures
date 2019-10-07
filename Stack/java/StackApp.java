public class StackApp {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();

		stack.push(17);

		System.out.println(stack.peek());

		stack.push(21);

		stack.push(194);

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());

	}
}
