package ex01;

public class Calculator {

    private String name;
    private int operationCount = 0;

    public Calculator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOperationCount() {
        return operationCount;
    }

    public int add(int a, int b) {
        operationCount++;
        return a + b;
    }

    public int subtract(int a, int b) {
        operationCount++;
        return a - b;
    }

    public int multiply(int a, int b) {
        operationCount++;
        return a * b;
    }

    public int divide(int a, int b) {
        operationCount++;
        if (b == 0) {
            throw new IllegalArgumentException("Impossível dividir por 0");
        }
        return a / b;
    }
}
