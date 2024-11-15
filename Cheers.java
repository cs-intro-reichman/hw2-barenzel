// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String word = args[0];
            int number = Integer.parseInt(args[1]);
            String word1 = word.toUpperCase();
            String letters = "AEFHILMNORSX";
            for (int i = 0; i < word1.length(); i++){
                char character = word1.charAt(i);
                String aOrAn = (letters.indexOf(character) != -1) ? "an" : "a";
                System.out.println("Give me " + aOrAn + " " + character + ": " + character + "!");
                }
            System.out.println("What does that spell?");
            for (int j = 0; j < number; j++){
                System.out.println(word1 + "!!!");
            }   
        }
}
