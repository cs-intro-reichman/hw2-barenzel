
public class CalcPi {
	public static void main(String [] args) { 
		int num = Integer.parseInt(args[0]);
		boolean isPrime = num > 1;
		double calcPi = 1.0;
		for (int i = 3; i < num && isPrime; i++) {
			for (int j = 2; j < i; j++) {
			if (i % j == 0) {
		    continue;
			} else if (j % 2 == 0) {
				calcPi -= (1.0 / (double)i);
			} else if (j % 2 != 0) {
				calcPi += (1.0 / (double)i);
			}
		}	
		}

        System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated: " + calcPi*4);

	}
} 