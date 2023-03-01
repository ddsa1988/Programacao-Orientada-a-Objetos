package com.Company;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        Scanner consoleRead = new Scanner(System.in);

        int randomNumber = (int)Math.floor(Math.random() * 10 + 1);
        int guess = 0;

        while (guess != randomNumber){
            while (true){
                System.out.println("Try to guess a number between 0 to 10: ");
                String data = consoleRead.next();

                try {
                    guess = Integer.parseInt(data);
                    break;
                }catch (Exception error){
                    System.out.println("Invalid number!");
                }
            }

            if(guess == randomNumber){
                System.out.println("You guessed right!!!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("You guessed too low!");
            }else {
                System.out.println("You guessed too high!");
            }
        }

    }
}
