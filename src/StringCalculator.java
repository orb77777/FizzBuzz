
public class StringCalculator {

	public Integer sum(String string) {
		if(string.equals("")) return 0;
		String delimiter = ",\n";

		//if(string.contains("//")){
		//	delimiter = (new Character(string.charAt(2))).toString();
		//}
		
		String[] numbers = string.split("["+delimiter+"]");
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

}
