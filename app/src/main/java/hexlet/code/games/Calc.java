package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {

    private static final String WELCOME = "What is the result of the expression?";
    private static final String[] OPERATION = {"*", "+", "-"};

    public static void calculatorGame() {
        String[][] evenGameData = new String[Engine.GAME_POINTS][2];

        for (int i = 0; i < Engine.GAME_POINTS; i++) {
            evenGameData[i] = genAnswerAndResult();
        }

        Engine.engine(WELCOME, evenGameData);
    }

    public static String[] genAnswerAndResult() {
        int firstNum = Engine.randomNum(Engine.MIN, Engine.MAX);
        int secondNum = Engine.randomNum(Engine.MIN, Engine.MAX);
        String mathOperation = OPERATION[Engine.randomNum(0, 2)];
        int result = calculate(firstNum, secondNum, mathOperation);

        String questionNum = firstNum + mathOperation + secondNum;
        String calculateResult = Integer.toString(result);

        return new String[]{questionNum, calculateResult};
    }
    public static int calculate(int firsNum, int secondNum, String mathOperation) {
        switch (mathOperation) {
            case "*": return firsNum * secondNum;
            case "+": return firsNum + secondNum;
            case "-": return firsNum - secondNum;
            default: System.out.println("Something wrong");
            return 0;
        }
    }
}
