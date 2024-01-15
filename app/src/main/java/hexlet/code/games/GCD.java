package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";

    public static void gcdGame() {
        String[][] evenGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            evenGameData[i] = genAnswerAndResult();
        }

        Engine.engine(DESCRIPTION, evenGameData);
    }

    public static int gcdCalculateRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdCalculateRecursion(b, a % b);
    }

    public static String[] genAnswerAndResult() {
        int firstNum = Utils.randomNum(Engine.MIN, Engine.MAX);
        int secondNum = Utils.randomNum(Engine.MIN, Engine.MAX);
        int result = gcdCalculateRecursion(firstNum, secondNum);

        String questionNum = firstNum + " " + secondNum;
        String gcdResult = Integer.toString(result);

        return new String[]{questionNum, gcdResult};
    }
}
