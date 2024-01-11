package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final String WELCOME = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void primeGame() {
        String[][] primeGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            primeGameData[i] = genAnswerAndResult();
        }
        Engine.engine(WELCOME, primeGameData);
    }

    public static String[] genAnswerAndResult() {
        int num = Engine.randomNum(Engine.MAX, Engine.MAX);
        String result = isPrime(num) ? "yes" : "no";
        String answerNum = Integer.toString(num);

        return new String[]{answerNum, result};
    }
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
