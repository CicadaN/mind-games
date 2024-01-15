package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenGame() {
        String[][] evenGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            evenGameData[i] = genAnswerAndResult();
        }

        Engine.engine(DESCRIPTION, evenGameData);
    }

    public static String[] genAnswerAndResult() {
        int num = Utils.randomNum(Engine.MAX, Engine.MAX);
        String isEven = isEven(num);
        String answerNum = Integer.toString(num);

        return new String[]{answerNum, isEven};
    }

    public static String isEven(int num) {
        return num % 2 == 0 ? "yes" : "no";
    }
}
