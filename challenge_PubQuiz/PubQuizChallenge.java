/**
 * 
 */
package challenge_PubQuiz;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 */
public class PubQuizChallenge {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instantiate Scanner and Random

		Scanner myScan = new Scanner(System.in);
		Random myRand = new Random();

		// declaring the questions and answers
		String[] jokeQuestions = { "Largest planet ? ", "Worse song ever ? ", "Capital of Peru?",
				"Roman god of War ?" };
		String[] jokeAnswers = { "Jupiter", "Castles in the Sky", "Lima", "Mars" };

		String anotherGame;

		do {

			int randomQuestionAndAnswer;
			String playerAnswer;

			System.out.println("General Knowledge quiz");
			randomQuestionAndAnswer = myRand.nextInt(0, jokeAnswers.length);
			System.out.println(jokeQuestions[randomQuestionAndAnswer]);
			System.out.println("Your answer...");
			playerAnswer = myScan.nextLine();

			if (jokeAnswers[randomQuestionAndAnswer].equalsIgnoreCase(playerAnswer)) {
				System.out.println("You're correct");
			} else {
				System.out.println("Not a bad guess, but the answer was " + jokeAnswers[randomQuestionAndAnswer]);
			}

			do {
				System.out.println("Another question (Y/ N) ..");
				anotherGame = myScan.nextLine();
			} while (anotherGame.charAt(0) != 'Y' && anotherGame.charAt(0) != 'y' && anotherGame.charAt(0) != 'N'
					&& anotherGame.charAt(0) != 'n');

		} while (anotherGame.charAt(0) == 'Y' || anotherGame.charAt(0) == 'y');
		
		
		myScan.close();
		System.out.println("Thanks for playing");

	}

}
