
public class Test {
	public static void main(String[] args) {
		System.out.println("Dynamic Stack");
		MyStack<Integer> myStack = new MyStack<>();

		System.out.println(myStack.size());
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		System.out.println(myStack.size());
		System.out.println(myStack.pop());
		System.out.println(myStack.size());

		System.out.println("\n\nStatic Stack");
		MyStaticStack myStaticStack = new MyStaticStack(2);
		myStaticStack.push(10);
		myStaticStack.push(11);
		System.out.println(myStaticStack.size());
		System.out.println(myStaticStack.pop());
		System.out.println(myStaticStack.size());
	}
}
