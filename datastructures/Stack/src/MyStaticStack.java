
public class MyStaticStack {
	private int lenght;
	private int[] array;

	private int top;

	public MyStaticStack(int lenght) {
		if (lenght < 1)
			throw new IllegalArgumentException("Stack length must be greater than 0");

		this.lenght = lenght;
		array = new int[lenght];
		top = -1;
	}

	public void push(int element) {
		if (isFull()) {
			System.out.println("Stack is full");
			return;
		}

		array[++top] = element;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return top;
		}

		return array[top--];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == lenght ? true : false;
	}

	public int size() {
		return top + 1;
	}
}
