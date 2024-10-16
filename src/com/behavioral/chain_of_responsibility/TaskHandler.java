package com.behavioral.chain_of_responsibility;

public abstract class TaskHandler {
    protected TaskHandler nextHandler;

    public void setNextHandler(TaskHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleTask(Task task);
}