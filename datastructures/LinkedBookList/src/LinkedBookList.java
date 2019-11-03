import java.text.NumberFormat;

public class LinkedBookList {
	private BookNode first;

	private int size;

	private final NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

	public LinkedBookList() {
	}

	public void insertAtFront(int register, String title, String author, double price) {
		if (isEmpty())
			first = new BookNode(register, title, author, price);
		else
			first = new BookNode(register, title, author, price, first);

		size++;
	}

	public void insertAtBack(int register, String title, String author, double price) {
		if (isEmpty())
			first = new BookNode(register, title, author, price);
		else {
			BookNode lastBookNode = node(size - 1);
			lastBookNode.setNextBook(new BookNode(register, title, author, price));
		}

		size++;
	}

	public void insert(int register, String title, String author, double price) {
		insertAtBack(register, title, author, price);
	}

	public void insert(int index, int register, String title, String author, double price) {
		if (!isPositionIndex(index))
			throw new IllegalArgumentException(outOfBoundsMsg(index));

		BookNode previous = node(index - 1);

		if (previous == null)
			insertAtFront(register, title, author, price);
		else {
			final BookNode newBookNode = new BookNode(register, title, author, price, previous.getNextBook());
			previous.setNextBook(newBookNode);
			size++;
		}
	}

	public void removeFromFront() {
		if (isEmpty())
			throw new IllegalArgumentException("List is empty");

		first = first.getNextBook();
		size--;
	}

	public void remove(int index) {
		if (!isElementIndex(index))
			throw new IllegalArgumentException(outOfBoundsMsg(index));

		BookNode previous = node(index - 1);
		BookNode current = node(index);

		if (previous == null)
			first = first.getNextBook();
		else {
			previous.setNextBook(current.getNextBook());
			current = null;
		}

		size--;
	}

	public BookNode get(int index) {
		if (!isElementIndex(index))
			throw new IllegalArgumentException(outOfBoundsMsg(index));

		return node(index);
	}

	public void clear() {
		first = null;
		size = 0;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("Empty list");
			return;
		}

		BookNode currentBook = first;

		while (currentBook != null) {
			System.out.print("[" + currentBook.getRegister() + ", ");
			System.out.print(currentBook.getTitle() + ", ");
			System.out.print(currentBook.getAuthor() + ", ");
			System.out.print(currencyFormat.format(currentBook.getPrice()) + "] ");
			currentBook = currentBook.getNextBook();
		}
		System.out.println();
	}

	private BookNode node(int index) {
		if (index < 0)
			return null;

		BookNode current = first;

		for (int i = 0; i < index; i++)
			current = current.getNextBook();

		return current;
	}

	private boolean isElementIndex(int index) {
		return index >= 0 && index < size;
	}

	private boolean isPositionIndex(int index) {
		return index >= 0 && index <= size;
	}

	public String outOfBoundsMsg(int index) {
		return "Index: " + index + ", Size: " + size;
	}

}
