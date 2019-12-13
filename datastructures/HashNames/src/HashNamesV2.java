import java.util.LinkedList;
import java.util.List;

public class HashNamesV2 {
	private final int TOTAL_LETTERS = 26;
	private Hash[] table = new Hash[TOTAL_LETTERS];

	private int[] lettersChar = new int[TOTAL_LETTERS];

	public HashNamesV2() {
		for (int i = 0; i < TOTAL_LETTERS; i++)
			table[i] = new Hash();

		for (int i = 0; i < TOTAL_LETTERS; i++)
			lettersChar[i] = 'A' + i;
	}

	public void insert(String name) {
		name = name.trim();
		int position = hash(name);

		if (position >= 0 && position < TOTAL_LETTERS)
			table[position].names.add(name);
	}

	public int hash(String name) {
		return hash(name.toUpperCase().charAt(0));
	}

	public int hash(char letter) {
		int position = -1;

		for (int i = 0; i < TOTAL_LETTERS; i++) {
			if (lettersChar[i] == (int) letter) {
				position = i;
				break;
			}
		}

		return position;
	}

	public List<String> get(char firtsLetter) {
		int position = hash(firtsLetter);

		return table[position].names;
	}

	public boolean isEmpty() {
		int emptyListCounter = 0;

		for (int i = 0; i < TOTAL_LETTERS; i++) {
			if (table[i].names.size() == 0)
				emptyListCounter++;
		}

		return emptyListCounter == 26;
	}

	// public String remove(char firstLetter) {
	// String nameRemoved;
	//
	// int position = hash(firstLetter);
	//
	// table[position].busy = false;
	// nameRemoved = table[position].name;
	//
	// return nameRemoved;
	// }

	public void print() {
		if (isEmpty()) {
			System.out.println("HashTable is empty");
			return;
		}

		for (int i = 0; i < TOTAL_LETTERS; i++) {
			List<String> names = table[i].names;

			if (names.size() > 0) {
				System.out.printf("%c%n", 'A' + i);

				for (String name : names)
					System.out.printf("\t%s%n", name);
			}
		}
	}

	private class Hash {
		List<String> names = new LinkedList<>();
	}
}
