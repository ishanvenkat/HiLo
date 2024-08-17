import java.util.Scanner;


public class HiLoCompleted {

    public static void main(String[] args) {

        // Use scan utility for parsing input 
        Scanner scan = new Scanner(System.in);

        // Use a variable to store user's choice to continue game after playing
        String playAgain = "";

        do {
           // STEP1: Create a random number for the user to guess
           // Intitialize a variable called 'correctNumber' add assign a random number between 1 and 100
           // HINT: use Math.random() to create a random number between 0 and 1
           // Multiplty by 100 and add 1 to so that its range is between 1 and 100
           int correctNumber = (int)(Math.random() * 100 + 1);

           // STEP2: Create a number to store the user's guess
           // Intitialize a variable called 'guessNumber' and initialize to 0
           int guessNumber = 0;

           // STEP3: Create a while loop to play the guess the number game
           // continue looping until the user has guessed correctly
           // HINT: the while condition should be guessNumber is not equal to correctNumber
           while (guessNumber != correctNumber) {
               // Inside the loop we first accept a new guess value from user and assign it to guessNumber
               // Compare guessNumber with correctNumber to check if it is high/low/equal
               // If they are equal, the user has guessed correctly, terminate the loop
               // If guess is low or high, continue the loop, i.e. accept a new guess value and check again

               // STEP4: Print a message asking for user to enter his value for guessNmber, between 1 and 100
               // HINT: use System.out.println("message...")
               System.out.println("Guess a number between 1 and 100:");

               // STEP5: Get the user's input value for guess number from ternimal
               // HINT: use scan.nextInt() and assign to guessNumber
               guessNumber = scan.nextInt();

               // STEP6: Compare the guess value with correctNumber and check if it is high/low/correct
               // and print appropriate message
               // HINT: use if else control flow
               // if guessNumber ls less than correctNumber, print that guess is too low
               // else if guessNumber is greater than correctNumber, print guess is too high
               // else the guessNumber must be equal to correctNumber, print that guess is correct, you've won!
               if (guessNumber < correctNumber)
                   System.out.println(guessNumber + " is too low. Try again.");
               else if (guessNumber > correctNumber)
                   System.out.println(guessNumber + " is too high. Try again.");
               else
                   System.out.println(guessNumber + " is correct. You win!");

            }  // End of while loop for guessing, terminated after user has guessed correctly

            // Check if user want's to continue the game
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();

      } while (playAgain.equalsIgnoreCase("y"));

      // Print thank you message before terminating game
      System.out.println("Thank you for playing! Goodbye.");

      // Close the scanner to free up resources and memory
      scan.close();
   }
}
