import org.junit.*;
public class StackTest {

	@Test
	public void testPeek() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(17);
		Assert.assertEquals((Integer)17,  stack.peek());
	}

	@Test
	public void testPush() {
		Stack<String> stack = new Stack<String>();
		stack.push("Derek");
		Assert.assertEquals("Derek", stack.peek());
	}
}
