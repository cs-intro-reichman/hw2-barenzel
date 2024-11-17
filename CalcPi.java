
public class CalcPi {
	public static void main(String [] args) { 
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
		}

}
		
		
	
