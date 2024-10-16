package com.behavioral.chain_of_responsibility;

public class HighPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == 3 && task.getOperation().equals("multiply")) {
            double result = task.getOperand1() * task.getOperand2();
            System.out.println("Multiplying: " + task.getOperand1() + " * " + task.getOperand2() + " = " + result);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
