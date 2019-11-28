
public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<>();

		queue.add(1);
		queue.print();
		queue.add(2);
		queue.print();
		queue.add(3);
		queue.print();

		System.out.println("\nQueue is empty: " + queue.isEmpty());
		System.out.println("Size: " + queue.size());

		System.out.printf("\n%s dequeued\n", queue.remove());
		queue.print();

		System.out.printf("Size: %d\n\n",  queue.size());
		queue.add(4);
		queue.print();
		System.out.println("Size: " + queue.size());

		System.out.printf("\nContains element 2? %s", queue.contains(2));
	}

}
