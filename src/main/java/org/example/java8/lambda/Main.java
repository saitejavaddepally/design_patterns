package org.example.java8.lambda;


public class Main {

    public static void main(String[] args) {

        MathUtils mathUtils = new MathUtils();
        CalculatorInstance instance = Calculator::new;
        instance.test(1, 2);

        MathOperation mathOperation = mathUtils::sumSquare;
        mathOperation.calculate(5, 4);

        mathOperation = (a, b) -> {
            System.out.println("Hello world");
            return MathUtils.add(a, b);
        };

        int result = mathOperation.calculate(1, 2);
        System.out.println(result);

        MathOperation mathOperation1 = (a, b) -> a - b;
        result = mathOperation1.calculate(3, 5);
        System.out.println(result);
    }
}
