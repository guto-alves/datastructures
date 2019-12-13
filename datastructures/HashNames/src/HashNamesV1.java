class Hash {
	String name;
	boolean busy;

	Hash() {
		this("", false);
	}

	Hash(String name, boolean busy) {
		this.name = name;
		this.busy = busy;
	}
}

public class HashNamesV1 {
	private final int TOTAL_LETTERS = 26;

	private Hash[] table = new Hash[TOTAL_LETTERS];

	private int[] letters = new int[TOTAL_LETTERS];

	public HashNamesV1() {
		for (int i = 0; i < TOTAL_LETTERS; i++)
			table[i] = new Hash();

		for (int i = 0; i < TOTAL_LETTERS; i++)
			letters[i] = 'A' + i;
	}

	public void insert(String name) {
		name = name.trim();

		int position = hash(name);

		if (position != -1) {
			table[hash(name)] = new Hash(name, true);
		}
	}

	public int hash(String name) {
		return hash(name.toUpperCase().charAt(0));
	}

	public int hash(char letter) {
		int position = -1;

		for (int i = 0; i < TOTAL_LETTERS; i++) {
			if (letters[i] == (int) letter) {
				position = i;
				break;
			}
		}

		return position;
	}

	public String get(char keyLetter) {
		return table[hash(keyLetter)].name;
	}

	public String remove(char keyLetter) {
		String nameRemoved = null;

		int position = hash(keyLetter);

		if (position != -1) {
			nameRemoved = table[position].name;
			table[position].busy = false;
		}

		return nameRemoved;
	}

	public boolean isEmpty() {
		boolean empty = true;

		for (int i = 0; i < TOTAL_LETTERS; i++) {
			if (table[i].busy) {
				empty = false;
				break;
			}
		}

		return empty;
	}

	public boolean isFull() {
		boolean full = true;

		for (int i = 0; i < TOTAL_LETTERS; i++) {
			if (!table[i].busy) {
				full = false;
				break;
			}
		}

		return full;
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("HashTable is empty");
			return;
		}

		for (int i = 0; i < TOTAL_LETTERS; i++) {
			if (table[i].busy)
				System.out.printf("%c = %s%n", letters[i], table[i].name);
		}
	}
}