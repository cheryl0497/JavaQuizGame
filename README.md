JAVA Quiz Game
This project is a Java Console Application.
It is developed using core Java principles and Object-Oriented Programming (OOP).
OOP helps in maintaining a DRY (Don't Repeat Yourself) codebase, making the code easier to maintain, modify, and debug.
Inspiration
The primary inspiration for this project is the popular quiz game show, 'Kaun Banega Crorepati?'. This international television game show features contestants answering a series of multiple-choice questions to win significant cash prizes.

Game Overview
The game is designed for a single player.
At the start, players can choose their difficulty level: Easy or Hard.
Both difficulty levels consist of 3 rounds. The Easy Game includes 3 questions per round, while the Hard Game has 5 questions per round.
Players must select the correct answer from four options provided for each question.
After selecting an answer, players can confirm their choice as final. If not confirmed, they can change their selection.
An incorrect answer results in losing the game with no money won.
Players cannot quit during a round but can choose to walk away with the prize money at the end of each round or continue to the next.
Successfully completing the final round wins the player a million dollars.
Players have access to 3 lifelines: 50/50, Ask the Audience, and Phone a Friend.
Lifelines are available from the start for Easy mode, but only from round 2 for Hard mode.
Software Requirements
Java Runtime Environment (JRE) - 1.8.0
Java Development Kit (JDK) - 17.0.2
Spring Tool Suite (STS)
How to Start the Game
Install the above software.
Clone the repository.
Open the project in Spring Tool Suite (STS).
Navigate to JAVA-Quiz-Game\src\javaquizgame\JavaQuizGame.java.
This file contains the main Java function.
Click on Run Project or press F6 to start the game. You should see the initial screen as follows:
bash
Copy code
********* Kaun Banega Crorepati ********

* Please choose an appropriate number from the menu below *
1. Start the game
2. View the rules of the game
3. Exit the game
Input Data
Two input data files are located in the root folder of this project:

game_rules.txt: Contains the rules of the game.
question_bank.txt: Contains all the quiz questions along with 4 options and the correct answer for each.
Project Packages
javaQuizGame: Contains the main class JavaQuizGame, the starting point of the project.
data: Manages input data through the Data class.
consoleInterface: Handles displaying and receiving user input and the initial launch screen.
businessLogic: The core of the project, managing the logic with classes like QuestionBank, game types (EasyGame/HardGame), User, Rounds, and Lifelines.
exceptions: Manages exceptions such as ending the game (EndGameException)
