import java.util.Arrays;

public class HashNamesV3 {
	private int TOTAL_LETTERS = 26;

	private Hash[] table = new Hash[TOTAL_LETTERS];

	private int[] lettersChar = new int[TOTAL_LETTERS];

	public HashNamesV3() {
		for (int i = 0; i < TOTAL_LETTERS; i++)
			table[i] = new Hash();

		for (int i = 0; i < TOTAL_LETTERS; i++)
			lettersChar[i] = 'A' + i;
	}

	public void insert(String name) {
		name = name.trim();

		int position = hash(name);

		while (table[position].busy) {
			position += 26;

			if (position > TOTAL_LETTERS)
				expand();
		}

		table[position].name = name;
		table[position].busy = true;
	}

	public void expand() {
		TOTAL_LETTERS *= 2;
		Arrays.copyOf(table, TOTAL_LETTERS);
	}

	public int hash(String name) {
		return hash(name.charAt(0));
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

	public void print() {
		for (int i = 0; i < lettersChar.length; i++) {
			
		}
		
	}

	class Hash {
		String name;
		boolean busy;

		Hash() {
			busy = false;
		}

	}
}
