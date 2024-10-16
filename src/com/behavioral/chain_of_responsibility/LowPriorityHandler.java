package com.behavioral.chain_of_responsibility;

public class LowPriorityHandler extends TaskHandler {
    @Override
    public void handleTask(Task task) {
        if (task.getPriority() == 1 && task.getOperation().equals("subtract")) {
            double result = task.getOperand1() - task.getOperand2();
            System.out.println("Subtracting: " + task.getOperand1() + " - " + task.getOperand2() + " = " + result);
        } else if (nextHandler != null) {
            nextHandler.handleTask(task);
        }
    }
}
