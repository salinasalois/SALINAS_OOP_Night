package Calculator;

class Calculator {
    double firstOperand, secondOperand;
    char operator;

    public Calculator() {
        firstOperand = 0;
        secondOperand = 0;
        operator = ' ';
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
    public double calculate() {
        return switch (operator) {
            case '+' -> add(firstOperand, secondOperand);
            case '-' -> subtract(firstOperand, secondOperand);
            case '*' -> multiply(firstOperand, secondOperand);
            case '/' -> divide(firstOperand, secondOperand);
            default -> 0;
        };
    }
}