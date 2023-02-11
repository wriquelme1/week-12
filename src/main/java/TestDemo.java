import java.util.Random;

public class TestDemo {
	
	private Random random = new Random();
	private static final int MAX_RANDOM = 10;
	
	
	public int randomNumberSquared () {
		int a = generateRandomInteger();
			 
		return a*a;
		
	}
	int generateRandomInteger() {
		return random.nextInt(MAX_RANDOM) + 1;
	}

	public int addPositive(int a, int b) {
		if (a % 2 == 0 && b % 2 == 0) {
			return a + b;
		}
		else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		}
		
	}
	


	
}