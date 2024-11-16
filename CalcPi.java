
public class CalcPi {
	public static void main(String [] args) { 
	    int num = Integer.parseInt(args[0]);
		boolean isPrime = num > 1;
		double calcPi = 1.0;
		for(int i = 2; i < num && isPrime; i++) {
			isPrime = (num % i != 0); //here is the problem
			if ((isPrime) && (i % 2 == 0)) {
				calcPi -= (1 / (double)num);
			} else if ((isPrime) && (i % 2 != 0)) {
				calcPi += (1 / (double)num);
			}	
			
				System.out.println(num);
		}

        System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated: " + calcPi*4);

	}
}
