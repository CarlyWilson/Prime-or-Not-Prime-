/*
 * Program: PrimeOrNotPrime
 * File Name: PrimeOrNotPrime.java
 * Author: Carly Wilson
 * Date: 08/25/15
 * Description: 
 */

package primeornotprime;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class PrimeOrNotPrime {

    // Declare constants and variables here
    boolean isPrime = false;
    
    Random rand = new Random();
    Timer timer = new Timer();
    
    // Play mode selection screen/home screen.
    public void playMode(){
        String userSelection = "Classic"; //will store which button gets hit
        switch(userSelection){
            case "Classic":
                classicDifficultySetting();
                break;
            case "Timed":
                timedDifficultySetting();
                break;
            case "Streaks":
                streaks();
                break;           
        }
    }
    // Level difficulty selection screen for Classic.
    //THIS IS PROBABLY REDUNDANT!!!! Could just have it do the random number calc in here maybe
    public void classicDifficultySetting(){
        String userSelection = "Easy"; //will store which button gets hit
        switch(userSelection){
            case "Easy":
                classicNumberGenerator(userSelection);
                break;
            case "Medium":
                classicNumberGenerator(userSelection);
                break;
            case "Hard":
                classicNumberGenerator(userSelection);
                break;
            case "Insane":
                classicNumberGenerator(userSelection);
                break;
        }
    }
    
    // Level difficulty selection screen for Timed.
    public void timedDifficultySetting(){
        String userSelection = "Easy"; //will store which button gets hit
        switch(userSelection){
            case "Easy":
                timedNumberGenerator(userSelection);
                break;
            case "Medium":
                timedNumberGenerator(userSelection);
                break;
            case "Hard":
                timedNumberGenerator(userSelection);
                break;
            case "Insane":
                timedNumberGenerator(userSelection);
                break;
        }
    }
    
    // Display Randomly Generated Number screen for classic
    public boolean classicNumberGenerator(String difficultySetting){
        switch(difficultySetting){
            case "Easy":
                int randNumEasy = rand.nextInt((100 - 0) + 1) + 0;
                isPrime = primenessChecker(randNumEasy);
                switch(userSelection){
                    case "Yes":
                        if(userSelection == isPrime){
                            return true;
                            // load to factors screen and correct message
                        }
                        else{
                            return false;
                            // streak resets and wrong message is displayed
                        }
                    case "No":
                        if(userSelection == isPrime){
                            return true;
                            // reload screen with new number correct message
                        }
                        else{
                            return false;
                            // streak resets and wrong message is displayed
                        }
                }
                break;
            case "Medium":
                int randNumMedium = rand.nextInt((1000 - 100) + 1) + 100;
                isPrime = primenessChecker(randNumMedium);
                switch(userSelection){
                    case "Yes":
                        if(userSelection == isPrime){
                            return true;
                            // load to factors screen and correct message
                        }
                        else{
                            return false;
                            // streak resets and wrong message is displayed
                        }
                    case "No":
                        if(userSelection == isPrime){
                            return true;
                            // reload screen with new number correct message
                        }
                        else{
                            return false;
                            // streak resets and wrong message is displayed
                        }
                }
                break;
            case "Hard":
                int randNumHard = rand.nextInt((10000 - 1000) + 1) + 1000;
                isPrime = primenessChecker(randNumHard);
                switch(userSelection){
                    case "Yes":
                        if(userSelection == isPrime){
                            return true;
                            // load to factors screen and correct message
                        }
                        else{
                            return false;
                            // streak resets and wrong message is displayed
                        }
                    case "No":
                        if(userSelection == isPrime){
                            return true;
                            // reload screen with new number correct message
                        }
                        else{
                            return false;
                            // streak resets and wrong message is displayed
                        }
                }
                break;
            case "Insane":
                int randNumInsane = rand.nextInt((100000 - 10000) + 1) + 10000;
                isPrime = primenessChecker(randNumInsane);
                switch(userSelection){
                    case "Yes":
                        if(userSelection == isPrime){
                            return true;
                            // load to factors screen and correct message
                        }
                        else{
                            return false;
                            // streak resets and wrong message is displayed
                        }
                    case "No":
                        if(userSelection == isPrime){
                            return true;
                            // reload screen with new number correct message
                        }
                        else{
                            return false;
                            // streak resets and wrong message is displayed
                        }
                }
                break;
        }
    }
    
    //Display Randomly Generated Number screen for timed
    public boolean timedNumberGenerator(String difficultySetting){
        switch(difficultySetting){
                case "Easy":
                    int randNumEasy = rand.nextInt((100 - 0) + 1) + 0;
                    isPrime = primenessChecker(randNumEasy);
                    timer.schedule(new TimerTask(){
                        public void run(){
                            // Display game over screen with streaks
                        }
                    }, 2*60*1000);
                    switch(userSelection){
                    case "Yes":
                        if(userSelection == isPrime){
                            return true;
                            // load to factors screen and correct message timer cont
                        }
                        else{
                            return false;
                            // game over, display streak count
                        }
                    case "No":
                        if(userSelection == isPrime){
                            return true;
                            // reload screen with new number correct message
                        }
                        else{
                            return false;
                            // game over, display streak count
                        }
                }
                    break;
                case "Medium":
                    int randNumMedium = rand.nextInt((1000 - 100) + 1) + 100;
                    isPrime = primenessChecker(randNumMedium);
                    timer.schedule(new TimerTask(){
                        public void run(){
                            // Display game over screen with streaks
                        }
                    }, 3*60*1000);
                    switch(userSelection){
                    case "Yes":
                        if(userSelection == isPrime){
                            return true;
                            // load to factors screen and correct message timer cont
                        }
                        else{
                            return false;
                            // game over, display streak count
                        }
                    case "No":
                        if(userSelection == isPrime){
                            return true;
                            // reload screen with new number correct message
                        }
                        else{
                            return false;
                            // game over, display streak count
                        }
                }
                    break;
                case "Hard":
                    int randNumHard = rand.nextInt((10000 - 1000) + 1) + 1000;
                    isPrime = primenessChecker(randNumHard);
                    timer.schedule(new TimerTask(){
                        public void run(){
                            // Display game over screen with streaks
                        }
                    }, 4*60*1000);
                    switch(userSelection){
                    case "Yes":
                        if(userSelection == isPrime){
                            return true;
                            // load to factors screen and correct message timer cont
                        }
                        else{
                            return false;
                            // game over, display streak count
                        }
                    case "No":
                        if(userSelection == isPrime){
                            return true;
                            // reload screen with new number correct message
                        }
                        else{
                            return false;
                            // game over, display streak count
                        }
                }
                    break;
                case "Insane":
                    int randNumInsane = rand.nextInt((100000 - 10000) + 1) + 10000;
                    isPrime = primenessChecker(randNumInsane);
                    timer.schedule(new TimerTask(){
                        public void run(){
                            // Display game over screen with streaks
                        }
                    }, 6*60*1000);
                    switch(userSelection){
                    case "Yes":
                        if(userSelection == isPrime){
                            return true;
                            // load to factors screen and correct message timer cont
                        }
                        else{
                            return false;
                            // game over, display streak count
                        }
                    case "No":
                        if(userSelection == isPrime){
                            return true;
                            // reload screen with new number correct message
                        }
                        else{
                            return false;
                            // game over, display streak count
                        }
                }
                    break;
        }
    }
    
    //Method to calculate if a number is prime or not prime
    boolean primenessChecker(int randomNumber){
        // Is randomNumber a multiple of two?
        if(randomNumber % 2 == 0){
            return false;
        }
        // If not check odds
        for(int i = 3; i*i < randomNumber; i += 2){
            if(randomNumber % i ==0){
                return false;
            }
        }
        return true;
    }
    
    //Method to calculate the Factors of a number
    public void factors(int randomNumber){
        
    }
    
    //Score screen
    public void streaks(){
        
    }
    
    // Below is for testing for now
    public static void main(String[] args) {}    
}
