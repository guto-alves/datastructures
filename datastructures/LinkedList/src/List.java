import java.util.NoSuchElementException;

class Node<E> {
	E data;
	Node<E> nextNode;

	public Node(E data) {
		this(data, null);
	}

	public Node(E data, Node<E> nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
}

public class List<E> {
	private Node<E> firstNode;
	private Node<E> lastNode;
	private String name;

	public List() {
		this("list");
	}

	public List(String name) {
		this.name = name;
	}

	public void insertAtFront(E data) {
		if (isEmpty()) {
			firstNode = lastNode = new Node<E>(data);
		} else {
			firstNode = new Node<>(data, firstNode);
		}
	}

	public void insertAtBack(E data) {
		if (isEmpty()) {
			firstNode = lastNode = new Node<E>(data);
		} else {
			lastNode = lastNode.nextNode = new Node<E>(data);
		}
	}

	public E removeFromFront() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException(name + "is empty");
		}

		E dataRemoved = firstNode.data;

		if (firstNode == lastNode) {
			firstNode = lastNode = null;
		} else {
			firstNode = firstNode.nextNode;
		}

		return dataRemoved;
	}

	public E removeFromBack() throws NoSuchElementException {
		if (isEmpty()) {
			throw new NoSuchElementException(name + "is empty");
		}

		E dataRemoved = lastNode.data;

		if (firstNode == lastNode) {
			firstNode = lastNode = null;
		} else {
			Node<E> current = firstNode;

			while (current.nextNode != lastNode) {
				current = current.nextNode;
			}

			current.nextNode = null;
			lastNode = current;
		}

		return dataRemoved;
	}

	public boolean isEmpty() {
		return firstNode == null;
	}

	public void print() {
		if (isEmpty()) {
			System.out.printf("Empty %s%n", name);
			return;
		}

		System.out.printf("The %s is: ", name);

		Node<E> current = firstNode;

		while (current != null) {
			System.out.printf("%s ", current.data);
			current = current.nextNode;
		}

		System.out.println();
	}
}
