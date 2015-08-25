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

public class PrimeOrNotPrime {

    // Declare constants and variables here
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
    public void classicNumberGenerator(String difficultySetting){
        switch(difficultySetting){
            case "Easy":
                int randNumEasy = rand.nextInt((100 - 0) + 1) + 0;
                break;
            case "Medium":
                int randNumMedium = rand.nextInt((1000 - 100) + 1) + 100;
                break;
            case "Hard":
                int randNumHard = rand.nextInt((10000 - 1000) + 1) + 1000;
                break;
            case "Insane":
                int randNumInsane = rand.nextInt((100000 - 10000) + 1) + 10000;
                break;
        }
    }
    
    //Display Randomly Generated Number screen for timed
    public void timedNumberGenerator(String difficultySetting){
        switch(difficultySetting){
                case "Easy":
                    int randNumEasy = rand.nextInt((100 - 0) + 1) + 0;
                    //timer
                    break;
                case "Medium":
                    int randNumMedium = rand.nextInt((1000 - 100) + 1) + 100;
                    //timer
                    break;
                case "Hard":
                    int randNumHard = rand.nextInt((10000 - 1000) + 1) + 1000;
                    //timer
                    break;
                case "Insane":
                    int randNumInsane = rand.nextInt((100000 - 10000) + 1) + 10000;
                    //timer
                    break;
        }
    }
    
    //Score screen
    public void streaks(){
        
    }
    
    // Below is for testing for now
    public static void main(String[] args) {}    
}
