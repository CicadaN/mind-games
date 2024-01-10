package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {

    private static final String WELCOME = "Find the greatest common divisor of given numbers.";

    public static void gcdGame() {
        String[][] evenGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            evenGameData[i] = genAnswerAndResult();
        }

        Engine.engine(WELCOME, evenGameData);
    }

    public static int gcdCalculateRecursion(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdCalculateRecursion(b, a % b);
    }

    public static String[] genAnswerAndResult() {
        int firstNum = Engine.randomNum(Engine.MIN, Engine.MAX);
        int secondNum = Engine.randomNum(Engine.MIN, Engine.MAX);
        int result = gcdCalculateRecursion(firstNum, secondNum);

        String questionNum = firstNum + " " + secondNum;
        String gcdResult = Integer.toString(result);

        return new String[]{questionNum, gcdResult};
    }
}
