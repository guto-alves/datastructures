
public class BookNode {
	private int register;
	private String title;
	private String author;
	private double price;
	private BookNode nextBook;

	public BookNode(int register, String title, String author, double price) {
		this(register, title, author, price, null);
	}

	public BookNode(int register, String title, String author, double price, BookNode nextBook) {
		this.register = register;
		this.title = title;
		this.author = author;
		this.price = price;
		this.nextBook = nextBook;
	}

	public int getRegister() {
		return register;
	}

	public void setRegister(int register) {
		this.register = register;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public BookNode getNextBook() {
		return nextBook;
	}

	public void setNextBook(BookNode nextBook) {
		this.nextBook = nextBook;
	}

}
