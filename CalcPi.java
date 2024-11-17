
public class CalcPi {
	public static void main(String [] args) { 
		int numberOfelements = Integer.parseInt(args[0]);
		double calcPi = 1.0;
		double one = -1;
		double num = 2;
		for (int i = 1; i <=  numberOfelements; num++) { 
			if (num % 2 != 0) {
				calcPi += one * (1 / (double)num);
				one *= -1;
				i++;
			} else {
				continue;
			}
		}	
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated: " + calcPi*4);
		

		/* 
		int num = Integer.parseInt(args[0]);
		double calcPi = 1.0;
		double one = -1;
		for (int i = 2; i <= num; i++) {
			int odd = i;
				if (odd % 2 == 0){
					continue;
				} else {
                    calcPi += one * (1 / (double)odd);
					one *= -1;
				}
		}
			
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi approximated: " + calcPi*4);
		*/
		}

}
		
		
	
