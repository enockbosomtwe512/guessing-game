package com.student.basics;
import java.util.Scanner;


public class guessinggame {
	public static void main(String[] args) {
        int secret = (int)(Math.random() * 100) + 1;
        Scanner input = new Scanner(System.in);
        int guess;
        int attempts = 0;

        while (attempts < 5) {
            System.out.print("Guess the number (1–100): ");
            guess = input.nextInt();
            attempts++;

            if (guess == secret) {
                System.out.println("Correct! You guessed it in " + attempts + " tries.");
                break;
            } else if (guess < secret) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (attempts == 5) {
            System.out.println("Out of attempts. The number was: " + secret);
        }

        
    }
}




	