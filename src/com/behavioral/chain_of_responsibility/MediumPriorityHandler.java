package com.behavioral.chain_of_responsibility;

public class MediumPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == 2 && task.getOperation().equals("add")) {
            double result = task.getOperand1() + task.getOperand2();
            System.out.println("Adding: " + task.getOperand1() + " + " + task.getOperand2() + " = " + result);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
