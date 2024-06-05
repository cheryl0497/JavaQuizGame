package com.java.console;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.java.data.Data;
import com.java.logic.EasyGame;
import com.java.logic.Game;
import com.java.logic.HardGame;
import com.java.logic.User;

public class ConsoleInterface {
    private static final Scanner READ = new Scanner(System.in);
    private static final int START_GAME_OPTION = 1;
    private static final int VIEW_RULES_OPTION = 2;
    private static final int EXIT_GAME_OPTION = 3;
    private static final int GO_BACK_OPTION = 0;
    private static final int EASY_GAME_OPTION = 1;
    private static final int HARD_GAME_OPTION = 2;

    public ConsoleInterface() {
    }
    
    public boolean launchScreen(Data data) {
        System.out.println("\n********* Kaun Banega Crorepati ********\n");   
        
        while (true) {
            try {                
                System.out.println("* Please choose an appropriate number from the menu below *");
                System.out.println("1. Start the game");
                System.out.println("2. View the rules of the game");
                System.out.println("3. Exit the game");
                
                int chosenOption = READ.nextInt();

                switch (chosenOption) {
                    case START_GAME_OPTION:
                        System.out.println("\n** Let's Begin the Game! **\n");
                        return true;
                    case VIEW_RULES_OPTION:
                        if (!displayRules(data)) {
                            return false;
                        }
                        break;
                    case EXIT_GAME_OPTION:
                        return false;
                    default:
                        System.out.println("Entered value is invalid, Please select from 1, 2, 3");
                }
            } catch (InputMismatchException ex) {
                System.out.println("There is an Input Mismatch. Please select from 1, 2, 3");
                READ.next(); // clear the invalid input
            }
        }
    }
    
    public boolean displayRules(Data data) {
        System.out.println(data.getGameRules());
        
        while (true) {
            try {
                System.out.println("\n* Please enter 0 to go back to the Main Menu *");
                int chosenOption = READ.nextInt();

                if (chosenOption == GO_BACK_OPTION) {
                    return true;
                } else {
                    System.out.println("Entered value is invalid");                    
                }
            } catch (InputMismatchException ex) {
                System.out.println("Input Mismatch");
                READ.next(); // clear the invalid input
            }
        }
    }
    
    public User createUser() {
        System.out.println("** First, let's get to know you! **");
        System.out.println("* Please Enter your First name:");
        String firstName = READ.next();
        System.out.println("* Please Enter your Last name:");
        String lastName = READ.next();
        
        return new User(firstName, lastName);
    }
    
    public void welcomeUser(User user) {
        System.out.println("\n** Hey there " + user.getFullName() + "! Welcome to the game, Kaun Banega Crorepati ***\n"
                + "* Now that we know you, let's get you started! *\n");
    }
    
    public Game createGame() {
        while (true) {
            try {
                System.out.println("* Please choose your game number from the menu below as per the difficulty level:");
                System.out.println("1. Easy Game");
                System.out.println("2. Hard Game");

                int chosenOption = READ.nextInt();

                switch (chosenOption) {
                    case EASY_GAME_OPTION:
                        System.out.println("\n* Easy Game! oh, that's a good safe choice! *\n");
                        return new EasyGame();
                    case HARD_GAME_OPTION:
                        System.out.println("\n* Hard Game! wooh, we have a risk-taker here! *\n");
                        return new HardGame();
                    default:
                        System.out.println("Entered value is invalid, Please select from 1, 2");                    
                }
            } catch (InputMismatchException ex) {
                System.out.println("Input Mismatch");
                READ.next(); // clear the invalid input
            }
        }
    }
}
