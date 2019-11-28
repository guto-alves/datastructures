import java.util.NoSuchElementException;

class Node<T> {
	T element;
	Node<T> nextNode;

	Node(T element) {
		this(element, null);
	}

	Node(T element, Node<T> nextNode) {
		this.element = element;
		this.nextNode = nextNode;
	}

	T getElement() {
		return element;
	}

	Node<T> getNextNode() {
		return nextNode;
	}
}

public class Queue<T> {
	private Node<T> firstNode;
	private Node<T> lastNode;

	private int size;

	public Queue() {
	}

	// insert at back
	public void add(T element) {
		if (isEmpty())
			firstNode = lastNode = new Node<T>(element);
		else
			lastNode = lastNode.nextNode = new Node<T>(element);
		size++;
	}

	// remove from front
	public T remove() {
		if (isEmpty())
			throw new NoSuchElementException("Queue is empty");

		T elementRemoved = firstNode.element;

		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;
		size--;
		return elementRemoved;
	}

	public T pool() {
		if (isEmpty())
			return null;

		T elementRemoved = firstNode.element;

		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;
		size--;
		return elementRemoved;
	}

	public T peek() {
		return isEmpty() ? null : firstNode.element;
	}

	public T element() {
		if (isEmpty())
			throw new NoSuchElementException("Queue is empty");

		return firstNode.element;
	}

	public boolean contains(T element) {
		Node<T> current = firstNode;

		do {
			if (current.element == element)
				return true;

		} while ((current = current.nextNode) != null);

		return false;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}

		Node<T> currentNode = firstNode;

		System.out.print("Queue: ");

		while (currentNode != null) {
			System.out.print(currentNode.element + " ");
			currentNode = currentNode.nextNode;
		}

		System.out.println();
	}

}
