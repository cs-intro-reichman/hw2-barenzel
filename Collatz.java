// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int N = Integer.parseInt(args[0]);
		String conciseOrVerbose = args[1];
		boolean concise = conciseOrVerbose.equals("c");
		boolean verbose = conciseOrVerbose.equals("v");
		if (verbose) {
		    for (int n = 1; n <= N; n++){
			    int num = n;
	         	System.out.print(num + ", ");	
	        	for (int i = 1; n >= 1; i++)  {
		         	if (num % 2 == 0) {
			     	num /= 2;	
		    	} else {
				    num = (num * 3) + 1;
			    }
			    if (num != 1) {
		            System.out.print(num + ", ");	
		       	} else {
				    System.out.println(num + " (" + (i + 1) + ")");
				    break;
		        }
		        }	
	      }
		  System.out.print("Every one of the first " + N + " hailstone sequences reached 1.");
	    }
		if (concise) {
			System.out.print("Every one of the first " + N + " hailstone sequences reached 1.");
		}

	}	
}
