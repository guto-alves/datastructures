
public class HashNamesTest {

	public static void main(String[] args) {
		HashNamesV1 hashTableNamesV1 = new HashNamesV1();
		hashTableNamesV1.insert("Aline");
		hashTableNamesV1.insert("Bianca");
		hashTableNamesV1.insert("Carol");
		hashTableNamesV1.insert("Daiane");
		hashTableNamesV1.insert("Eliane");
		hashTableNamesV1.insert("Fernanda");
		hashTableNamesV1.insert("Alice");

		hashTableNamesV1.print();

		System.out.println("\nNome removido da chave 'A' = " + hashTableNamesV1.remove('A'));
		hashTableNamesV1.print();

		System.out.println("get 'D' = " + hashTableNamesV1.get('D'));

		// HashTableNamesV2 hashTableNamesV2 = new HashTableNamesV2();
		//
		// hashTableNamesV2.insert("Aline");
		// hashTableNamesV2.insert("Alice");
		// hashTableNamesV2.insert("Bia");
		// hashTableNamesV2.insert("Bianca");
		// hashTableNamesV2.insert("Carol");
		// hashTableNamesV2.insert("Carla");
		// hashTableNamesV2.insert("This");
		// System.out.println("A = " + hashTableNamesV2.get('C'));
		//
		// System.out.println();
		//
		// hashTableNamesV2.print();

//		HashTableNamesV3 hashTableNamesV3 = new HashTableNamesV3();
//		hashTableNamesV3.insert("Aline");
//		hashTableNamesV3.insert("Alice");
//		hashTableNamesV3.insert("Bianca");
//		hashTableNamesV3.insert("Barbara");
//		hashTableNamesV3.insert("Carol");
//		hashTableNamesV3.insert("This");
//		hashTableNamesV3.insert("Fernanda");
//		hashTableNamesV3.print();
	}
}
