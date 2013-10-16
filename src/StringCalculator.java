import java.util.ArrayList;


public class StringCalculator {

	public Integer sum(String string) {
		String delimiter = "[,\n]";
		if(string.contains("//")){
			delimiter = extractDelimiter(string);
			string = getStringWithoutDelimitertLine(string);
		}
		
		if(string.equals("")) return 0;
		
		String[] numbers = string.split(delimiter);
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			Integer number = Integer.valueOf(numbers[i]);
			if(number < 0) {
				throw new NegativeNumberException();
			}
			else if(number > 1000){
				continue;
			}
			else {
				sum += number;
			}
		}
		return sum;
	}

	private String getStringWithoutDelimitertLine(String string) {
		int index = string.indexOf('\n');
		return string.substring(index+1);
	}

	private String extractDelimiter(String string) {
		if (string.charAt(2) != '[') {
			return "" + string.charAt(2);
		}
		char[] symbols = string.toCharArray();
		StringBuilder delimiters = new StringBuilder();
		for (int i = 3; i < symbols.length; i++) {
			if (symbols[i] != ']') {
				delimiters.append(symbols[i]);
			}
			else break;
		}
		
		return delimiters.toString();
	}

}
