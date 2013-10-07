public class Text {

	private String text;

	public Text(String text) {
		this.text = (text != null) ? text : "";
	}

	public Boolean isPalindrome() {
		if (text.isEmpty()) {
			return false;
		}
		char[] letters = text.toLowerCase().toCharArray();

		for (int i = 0, j = letters.length - 1; i < letters.length && j >= 0; i++, j--) {
			while (!Character.isAlphabetic(letters[i])) {
				if (i < letters.length - 1) {
					i++;
				} else {
					break;
				}
			}
			while (!Character.isAlphabetic(letters[j])) {
				if (j > 0) {
					j--;
				} else {
					break;
				}
			}
			if (letters[i] != letters[j]) {
				return false;
			}
		}

		return true;

	}

	public Boolean containsPalindrome() {
		Boolean result = false;
		for(int i = 0; i < text.length(); i++) {
			for (int j = i + 1; j < text.length(); j++) {
				String substring = text.substring(i, j);
				Text subText = new Text(substring);
				result = subText.isPalindrome();
			}
		}
		return result;
	}

}
