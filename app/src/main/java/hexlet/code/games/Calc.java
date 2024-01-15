package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {

    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATION = {"*", "+", "-"};

    public static void calculatorGame() {
        String[][] evenGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            evenGameData[i] = genAnswerAndResult();
        }

        Engine.engine(DESCRIPTION, evenGameData);
    }

    public static String[] genAnswerAndResult() {
        int firstNum = Utils.randomNum(Engine.MIN, Engine.MAX);
        int secondNum = Utils.randomNum(Engine.MIN, Engine.MAX);
        String mathOperation = OPERATION[Utils.randomNum(0, 2)];
        int result = calculate(firstNum, secondNum, mathOperation);

        String questionNum = String.join(" ", Integer.toString(firstNum), mathOperation, Integer.toString(secondNum));
        String calculateResult = Integer.toString(result);

        return new String[]{questionNum, calculateResult};
    }
    public static int calculate(int firsNum, int secondNum, String mathOperation) {
        switch (mathOperation) {
            case "*": return firsNum * secondNum;
            case "+": return firsNum + secondNum;
            case "-": return firsNum - secondNum;
            default: throw new Error("Something wrong: " + mathOperation);
        }
    }
}
