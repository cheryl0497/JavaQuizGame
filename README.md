JAVA-Quiz-Game
This project is a JAVA Console Application.
Developed using core JAVA principles and Object-Oriented Programming (OOP).
OOP ensures that the code remains DRY (Don't Repeat Yourself), making it easier to maintain, modify, and debug.
Inspiration
This project draws its inspiration from the popular quiz show: 'Kaun Banega Crorepati', a global television phenomenon where participants answer multiple-choice questions to win significant cash prizes.
Game Overview
The game supports single-player mode only.
Players can choose their preferred difficulty level at the beginning: Easy or Hard.
The game consists of 3 rounds for both difficulty levels. Easy mode has 3 questions per round, while Hard mode has 5 questions per round.
Players must select the correct answer from 4 provided options.
After selecting an answer, players can confirm their final choice. If not confirmed, they can change their answer.
An incorrect answer results in the player losing the game and leaving with no money.
Players cannot quit in the middle of a round but can choose to walk away with their winnings at the end of each round or proceed to the next round.
Completing the final round successfully wins the player a million dollars.
Players have access to 3 lifelines: 50/50, Ask the Audience, and Phone a Friend.
Lifelines are available from round 2 in Hard mode, while in Easy mode, all lifelines are available from round 1.
Software Requirements
Java Runtime Environment - 1.8.0 (JRE)
Java Development Kit - 17.0.2 (JDK)
Spring Tool Suite (STS) - 4 - IDE
How to Start the Game
Ensure all the required software is installed.
Clone the project repository.
Open the project in Spring Tool Suite (STS).
Navigate to JAVA-Quiz-Game\src\javaquizgame\JavaQuizGame.java.
This file contains the main function to start the game.
Run the project (press F6 or use the Run Project option) to see the initial screen:
bash

********* Kaun Banega Crorepati? ********

* Please choose an appropriate number from the menu below *
1. Start the game
2. View the rules of the game
3. Exit the game
Data Files
Two input data files are located in the root folder of this project:

game_rules.txt: Contains the rules of the game.
question_bank.txt: Includes all the quiz questions along with 4 options and the correct answer.
Package Structure
javaQuizGame: Contains the main class JavaQuizGame, the entry point of the project.
data: Stores all input data within the Data class.
consoleInterface: Manages user interaction, displaying information, and receiving input. Also handles the game's launch screen.
businessLogic: The core of the project, handling game logic with classes such as Question Bank, Game Types (Easy/Hard), User, Rounds, and Lifelines.
exceptions: Manages game-ending exceptions through the EndGameException class
