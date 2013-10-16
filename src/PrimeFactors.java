import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

	public static List<Integer> generate(int number) {
		List<Integer> primes = new ArrayList<>();
		if (number == 0) {
			return primes;
		} else {
			int divider = 2;
			while (number != 0) {
				if (isPrime(number)) {
					primes.add(number);
					return primes;
				}
				if (number % divider == 0) {
					primes.add(divider);
					number = number / divider;
				}
				if (number % divider != 0) {
					do {
						divider++;
					} while (!isPrime(divider));
				}
			}
			return primes;
		}
	}

	private static boolean isPrime(int number) {
		if(number < 4) return true;
		for (int i = 2; i <= Math.sqrt((double) number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}