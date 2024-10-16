package com.behavioral.command_pattern;

import com.behavioral.chain_of_responsibility.Task;

public class TaskCommand implements Command {
    private Task task;

    public TaskCommand(Task task) {
        this.task = task;
    }

    @Override
    public void execute() {
        System.out.println("Executing task: " + task.getDescription());
    }
}
