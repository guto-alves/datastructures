
class Node<T> {
	T element;
	Node<T> next;

	public Node(T element) {
		this(element, null);
	}

	public Node(T element, Node<T> next) {
		this.element = element;
		this.next = next;
	}
}

public class MyStack<T> {
	private Node<T> headNode;

	private int size;

	public MyStack() {
	}

	public void push(T element) {
		if (isEmpty())
			headNode = new Node<T>(element);
		else
			headNode = new Node<T>(element, headNode);

		size++;
	}

	public T pop() {
		T elementRemoved = headNode.element;

		headNode = headNode.next;

		size--;

		return elementRemoved;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}
}
