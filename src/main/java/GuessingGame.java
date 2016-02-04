import java.util.Random;
import java.util.Scanner;


public class GuessingGame {


    public static void main(String[] args) {

        Random rand = new Random();
        int numberToGuess = rand.nextInt(100);
        int numberOfTries = 0;
        int guess;
        boolean win = false;


        Scanner input = new Scanner(System.in);


        while (win == false) {
            System.out.println("Guess a number between 1 and 100: ");
            guess = input.nextInt();
            numberOfTries++;

            if (guess == numberToGuess) {
                win = true;

            } else if (guess < numberToGuess) {
                System.out.println("Your guess is lower than the number");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is higher than the number");
            }
        }
            System.out.println("You WIN!");
            System.out.println("The number was " + numberToGuess);
            System.out.println("It took you " + numberOfTries + " attempts");

    }


}
