import java.util.Scanner;
	 
	public class NumberGame{
	 
	    public static void
	    guessingNumberGame()
	    {
	        // Scanner Class
	        Scanner sc = new Scanner(System.in);
	 
	        // Generate the numbers
	        int number = 1 + (int)(100* Math.random());
	 
	        // Given K trials
	        int T = 6;
	 
	        int i, guess;
	 
	        System.out.println(
	            "A number is chosen"
	            + " between 1 to 100."
	            + "Guess the number"
	            + " within 6 trials.");
	 
	        // Iterate over K Trials
	        for (i = 0; i < T; i++) {
	 
	            System.out.println(
	                "Guess the number:");
	 
	            // Take input for guessing
	            guess = sc.nextInt();
	 
	            // If the number is guessed
	            if (number == guess) {
	                System.out.println(
	                    "Congratulations!"
	                    + " You guessed the number.");
	                break;
	            }
	            else if (number > guess
	                     && i != T - 1) {
	                System.out.println(
	                    "The number is "
	                    + "greater than " + guess);
	            }
	            else if (number < guess
	                     && i != T - 1) {
	                System.out.println(
	                    "The number is"
	                    + " less than " + guess);
	            }
	        }
	 
	        if (i == T) {
	            System.out.println(
	                "Sorry..You have exhausted"
	                + " T trials.");
	 
	            System.out.println(
	                "The number was " + number);
	        }
	    }
	 
	    // Driver Code
	    public static void
	    main(String arg[])
	    {
	 
	        // Function Call
	        guessingNumberGame();
	    }
	}