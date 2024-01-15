package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final int LENGTH_PROGRESSION = 10;
    private static final int NO_MAGIC_MAX_STEP = 20;

    public static void progressionGame() {
        String[][] progressionGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            progressionGameData[i] = genAnswerAndResult();
        }

        Engine.engine(DESCRIPTION, progressionGameData);
    }

    public static String[] genAnswerAndResult() {
        int missingLine = Utils.randomNum(0, LENGTH_PROGRESSION - 1);
        int progressionNum = Utils.randomNum(1, NO_MAGIC_MAX_STEP);
        int firstNum = Utils.randomNum(Engine.MIN, Engine.MAX);

        String[] progression = genProgression(firstNum, progressionNum);
        String missingNum = progression[missingLine];
        progression[missingLine] = "..";
        String questionNum = String.join(" ", progression);

        return new String[]{questionNum, missingNum};
    }

    public static String[] genProgression(int firstNum, int progressionNum) {
        String[] progression = new String[LENGTH_PROGRESSION]; // создаем массив для прогрессии
        for (int i = 0; i < LENGTH_PROGRESSION; i++) {
            progression[i] = Integer.toString(i * progressionNum + firstNum);
        }
        return progression;
    }
}
