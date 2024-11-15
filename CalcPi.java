// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		boolean isPrime = num > 1;
		double calcPi = 0.0;
		for(int i = 2; i < num && isPrime; i++) {
			if (isPrime) {
				calcPi += (1 / (double)num);
			} 	
		}
        System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated: " + calcPi);

	}
}
