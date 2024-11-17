
public class CalcPi {
	public static void main(String [] args) { 
		int numberOfelements = Integer.parseInt(args[0]);
		double calcPi = 1.0;
		double one = -1;
		double num = 3;
		for (int i = 1; i < numberOfelements; num += 2) { 
			if (num % 2 != 0) {
				calcPi += one * (1 / (double)num);
				one *= -1;
				i++;
			} else {
				continue;
			}
		}	
		calcPi *= 4;
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated:	" + calcPi);
		}

}
		
		
	
