package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int GAME_POINTS = 3;
    public static final int MIN = 0;
    public static final int MAX = 100;

    public static void engine(String welcome, String[][] gameData) {
        Scanner consoleScanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = consoleScanner.next();
        System.out.println("Hello, " + userName + "!");

        System.out.println(welcome);

        for (var row : gameData) {
            String question = row[0];
            String result = row[1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = consoleScanner.next();

            if (!answer.equals(result)) {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was " + result + ".\n"
                        + "Let's try again, " + userName + "!");
                return;
            }

            System.out.println("Correct!");
        }
        System.out.println("Congratulations, " + userName + "!");
        consoleScanner.close();
    }
}
