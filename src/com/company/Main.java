package com.company;

/*
give instructions
pick a random number
get a guess from the user
compare guess to the number
 notify user of higher or lower  or ... that they won, do they want to play again?
 */


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//          initialize our Scanner, so we can take input from user
        Scanner input = new Scanner(System.in);

//      set the number of guesses
        int numberOfGuesses = 0;
        final int MAX_GUESS_COUNT = 4;


        //        give instructions
        System.out.println("Welcome To the Guessing Game! I'm thinking of a number between 1 and 100. can you figure it out?");

        //       pick a random number
        int randomNumber = (int) Math.ceil(Math.random() * 100);
        System.out.println(randomNumber);

        //      get the guess from the user
        int guessedNumber;


        //      try catch to check for invalid input
        try {
//          do/while will loop through guesses until correct guess given
            do {

                System.out.println("guess a number between 1 and 100");
                guessedNumber = input.nextInt();
                System.out.println("you guessed the number " + guessedNumber);


                //        compare the guess to the random number
                if (randomNumber > guessedNumber) {
                    System.out.println("your guess is too low. Guess higher.");
                    numberOfGuesses++;
                } else if (randomNumber < guessedNumber) {
                    System.out.println("your guess is to high guess lower.");
                    numberOfGuesses++;
                } else {
                    System.out.println("CONGRATS!!! you guessed my number " + randomNumber + "!!!");
                }
            } while (randomNumber != guessedNumber && numberOfGuesses < MAX_GUESS_COUNT);


        } catch (
                Exception e)

        {
            System.out.println("please enter an actual number");

        }
    }


    //        HOW TO GET A USABLE RANDOM NUMBER
//        double randomNumber;
//        randomNumber = Math.random();
//        System.out.println("the Random Number Is: " + randomNumber);
//
//        double randomNumberTimesHundred = randomNumber * 100;
//        System.out.println("the Random Number Times Hundred" + randomNumberTimesHundred);
//
//        int randomNumberRoundedToCeil = (int) Math.ceil(randomNumber);
//        System.out.println("The Rounded Ceil is: " + randomNumberTimesHundred);
//
//        int randomNumberRoundedToFloor = (int) Math.floor(randomNumberTimesHundred);
//        System.out.println("The Rounded To Floor is: " + randomNumberTimesHundred);
//
//        int randomNumberRoundedNormally = (int) Math.round(randomNumberTimesHundred);
//        System.out.println("The Rounding that we're used to: " + randomNumberRoundedNormally);


}

