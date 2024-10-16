package com.behavioral.chain_of_responsibility;

public class Task {
    private String description;
    private int priority;
    private double operand1;
    private double operand2;
    private String operation;

    public Task(String description, double operand1, double operand2, String operation) {
        this.description = description;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;

        switch (operation) {
            case "subtract":
                this.priority = 1;
                break;
            case "add":
                this.priority = 2;
                break;
            case "multiply":
                this.priority = 3;
                break;
            default:
                throw new IllegalArgumentException("Unknown operation: " + operation);
        }
    }

    public int getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public String getOperation() {
        return operation;
    }
}
