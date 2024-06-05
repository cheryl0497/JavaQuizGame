package com.java.quiz.main;

import com.java.console.ConsoleInterface;
import com.java.data.Data;
import com.java.exceptions.EndGameException;
import com.java.logic.EasyGame;
import com.java.logic.Game;
import com.java.logic.HardGame;
import com.java.logic.QuestionBank;
import com.java.logic.User;

import java.io.IOException;

public class JavaQuizGame {
    public static void main(String[] args) throws IOException {
        // Initialize data
        Data data = new Data();
        try {
            data.init();
        } catch (IOException ex) {
            System.err.println("Error initializing data: " + ex.getMessage());
            return;
        } catch (Exception ex) {
            System.err.println("Unexpected error: " + ex.getMessage());
            return;
        }

        ConsoleInterface consoleInterface = new ConsoleInterface();

        // Launch screen with initial instructions for the game
        if (consoleInterface.launchScreen(data)) {
            // Create question bank
            QuestionBank questionBank = new QuestionBank();
            questionBank.createQuestionBank(data.getQuestionsFilePath());

            // Create a user
            User user = consoleInterface.createUser();
            consoleInterface.welcomeUser(user);

            // Get game object based on user's choice of difficulty
            Game game = consoleInterface.createGame();

            // Set question bank and user
            game.setQB(questionBank);
            game.setUser(user);

            // Assign cash prizes as per question number
            game.assignCashPrize(data);

            // Enable lifeline in respective rounds based on game's difficulty level
            int enableLifelineInRound;
            if (game instanceof EasyGame) {
                enableLifelineInRound = 1;
            } else if (game instanceof HardGame) {
                enableLifelineInRound = 2;
            } else {
                enableLifelineInRound = 0;
            }

            // Start the game
            try {
                game.startGame(enableLifelineInRound);
            } catch (EndGameException ex) {
                System.out.println(ex.getMessage());
            } catch (Exception ex) {
                System.err.println("Unexpected error during game: " + ex.getMessage());
            }
        } else {
            System.out.println("** Already leaving? That's sad! **");
        }
    }
}
