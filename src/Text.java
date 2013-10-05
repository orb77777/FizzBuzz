
public class Text {

	private String text;

	public Text(String text) {
		this.text = text;
	}

	public Object isPalindrome() {
		char[] letters = text.toLowerCase().toCharArray();

		for (int i = 0, j = letters.length - 1; i < letters.length && j >= 0; i++, j--) {
			if (letters[i] != letters[j]) {
				return false;
			}
		}

		return true;

	}

}
