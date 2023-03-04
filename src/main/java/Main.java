/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;


import java.util.Random;


public class Main {
    public static void main(String[] args) {
        Integer startRange = 1;
        Integer endRange = 50;
        Integer attempts = 5;
        Scanner keyboard;
        int guess;


        // getting random number
        Random rand = new Random();
        Integer correct = rand.nextInt(endRange);


        // getting input guess
        keyboard = new Scanner(System.in);
        System.out.println("Enter an integer between " + startRange + " and " + endRange + " within " + attempts + " attempts.");
        guess = keyboard.nextInt();


        //while loop for guesses
        while (guess != correct) {
            if (guess < correct) {
                System.out.println("Too small");
            } else if (guess > correct){
                System.out.println("Too large");
            }
            System.out.println("enter an integer");
            guess = keyboard.nextInt();


            attempts++;


        }
        System.out.println("Correct guess");
        System.out.println("Number of Attempts");
        System.out.println(attempts);
    }
}

