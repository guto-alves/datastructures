
public class LinkedBookListTest {

	public static void main(String[] args) {
		LinkedBookList bookList = new LinkedBookList();

		bookList.insert(1, "Title 1", "Author 1", 100);
		bookList.print();
		System.out.println(bookList.size());
		bookList.insert(2, "Title 2", "Author 2", 200);
		bookList.print();
		System.out.println(bookList.size());
		bookList.insert(3, "Title 3", "Author 3", 300);
		bookList.print();
		System.out.println(bookList.size());

		bookList.insert(0, 4, "Title 4", "Author 4", 400);
		bookList.print();
		System.out.println(bookList.size());

		bookList.remove(0);
		bookList.print();
		System.out.println(bookList.size());

		bookList.clear();
		System.out.println(bookList.size());

		bookList.insert(5, "Title 5", "Author 5", 500);
		bookList.print();

		System.out.println("Get book: " + bookList.get(0).getTitle());
	}

}
