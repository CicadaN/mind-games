package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final String WELCOME = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void evenGame() {
        String[][] evenGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            evenGameData[i] = genAnswerAndResult();
        }

        Engine.engine(WELCOME, evenGameData);
    }

    public static String[] genAnswerAndResult() {
        int num = Engine.randomNum(Engine.MAX, Engine.MAX);
        String isEven = num % 2 == 0 ? "yes" : "no";
        String answerNum = Integer.toString(num);

        return new String[]{answerNum, isEven};
    }
}
