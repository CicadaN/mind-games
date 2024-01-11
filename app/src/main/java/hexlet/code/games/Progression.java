package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {

    private static final String WELCOME = "What number is missing in the progression?";
    private static final int LENGTH_PROGRESSION = 10;

    public static void progressionGame() {
        String[][] progressionGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            progressionGameData[i] = genAnswerAndResult();
        }

        Engine.engine(WELCOME, progressionGameData);
    }

    public static String[] genAnswerAndResult() {
        int missingLine = Engine.randomNum(0, LENGTH_PROGRESSION-1); // Выбираем номер числа, которое будет спрятано
        int progressionNum = Engine.randomNum(1, 20); // Задаем число, на которое прогрессия будет увеличиваться
        int firstNum = Engine.randomNum(11, 100); // Заранее заполняем первый эллемент массива

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
