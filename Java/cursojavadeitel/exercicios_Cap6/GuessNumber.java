package cursojavadeitel.exercicios_Cap6;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	Scanner input = new Scanner(System.in);

	public void getRandomNumber() {

	// get a randomize number
	Random rand = new Random();
	int randNum = 1 + rand.nextInt(1000);

	// displays the message to guess a number between 1 and 1000
	System.out.println("Guess a number between 1 and 1000: ");
	int guess = input.nextInt();

	// call the method matchGuess() and pass the value of randNum and guess
	matchGuess(randNum, guess);
	} // end getRandomNumber()

	// match the guessing number and the random number
	public void matchGuess(int randNum, int guess) {

	// if the guessing number lower than the random number, display the message “Too low”
	if (guess < randNum) {
	System.out.println("Too low. Try again.");

	// gets the next guessing number
	System.out.println("Next guess: ");
	guess = input.nextInt();

	// rematch the new guessing number with the random number
	matchGuess(randNum, guess);

	// if the guessing number higher than the random number, display the message “Too high”
	} else if (guess > randNum) {
	System.out.println("Too high. Try again.");

	// gets the next guess
	System.out.println("Next guess: ");
	guess = input.nextInt();

	// rematch the new guessing number with the random number
	matchGuess(randNum, guess);

	// if the guessing number is match the random number, display “Congratulations”
	} else if (guess == randNum) {
	System.out.println("Congratulations. You guessed the number!");
	getOptions();
	} // end if-else-if
	} // end matchGuess

	// Ask th user to decide whether to play again or exit the program
	public void getOptions() {
	System.out.println("1. Play again");
	System.out.println("2. Exit the game");
	System.out.println("Enter your choice: ");
	int choice = input.nextInt();

	// play again
	if (choice == 1) {
	getRandomNumber();

	// exit the program
	} else if (choice == 2) {
	System.exit(0);
	System.out.println("Thanks for playing the game.");

	// if choice is not 1 and 2
	} else if (choice != 1 || choice != 2) {
	System.out.println("Incorrect response. Please re-enter your choice");
	getOptions();
	} // end if-else-if
	} // end getOptions()
} // end class GuessNumber


