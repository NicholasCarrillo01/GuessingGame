package com.company;

/*
give instructions
pick a random number
get a guess from the user
compare guess to the number
 notify user of higher or lower  or ... that they won, do they want to play again?
 */




public class Main {

    public static void main(String[] args) {
        // write your code here

         System.out.println("Welcome To the Guessing Game! I'm thinking of a number between 1 and 100. can you figure it out?");

//         pick a random number
        int randomNumber = (int) Math.ceil(Math.random() * 100);
        System.out.println(randomNumber);



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
}
