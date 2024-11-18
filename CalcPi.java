
public class CalcPi {
	public static void main(String [] args) { 
		int numberOfelements = Integer.parseInt(args[0]);
		double calcPi = 0.0;
		double one = 1;
		double num = 1;
		for (int i = 0; i < numberOfelements; i++, num += 2) { 
				calcPi += one * (1 / (double)num);
				one *= -1;
		}
		calcPi *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated:     " + calcPi);
	}
}
		
		
	
