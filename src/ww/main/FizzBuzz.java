package ww.main;

public class FizzBuzz {
	
	private static final int FIZZ = 3;
	private static final int BUZZ = 5;
	private static final int FIZZBUZZ = 15;
	
	public FizzBuzz() {}
	
	public static String[] getListOfFizzAndBuzz(int numberOfCycles) {
		String[] newList = new String[numberOfCycles];
		int count = 1;
		for(int i = 0; i < numberOfCycles; i++) {
			if(isDividableByFizzBuzz(count)) {
				newList[i] = "FizzBuzz";
			}
			else if(isDividableByBuzz(count)) {
				newList[i] = "Buzz";
			}
			else if(isDividableByFizz(count)) {
				newList[i] = "Fizz";
			} 
			else {
				newList[i] = count + "";
			}
			count++;
		}
		
		return newList;
	}
	
	private static boolean isDividableByFizzBuzz(int number) {
		if((number / FIZZBUZZ) > 0 && (number % FIZZBUZZ) < 1)
			return true;
		
		return false;
	}
	
	private static boolean isDividableByBuzz(int number) {
		if((number / BUZZ) > 0 && (number % BUZZ) < 1)
			return true;
		
		return false;
	}
	
	private static boolean isDividableByFizz(int number) {
		if((number / FIZZ) > 0 && (number % FIZZ) < 1)
			return true;
		
		return false;
	}
}
