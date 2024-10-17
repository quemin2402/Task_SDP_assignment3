package com.behavioral.tests;

import com.behavioral.chain_of_responsibility.Task;
import com.behavioral.command_pattern.Command;
import com.behavioral.command_pattern.TaskCommand;
import com.behavioral.iterator_pattern.TaskIterator;
import com.behavioral.iterator_pattern.TaskListIterator;
import com.behavioral.mediator_pattern.Mediator;
import com.behavioral.mediator_pattern.TaskMediator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task task1 = new Task("Subtract operation", 10, 5, "subtract");
        Task task2 = new Task("Add operation", 4, 6, "add");
        Task task3 = new Task("Multiply operation", 7, 8, "multiply");

        List<Task> taskList = new ArrayList<>();
        taskList.add(task1);
        taskList.add(task2);
        taskList.add(task3);

        taskList.sort(Comparator.comparing(Task::getPriority).reversed());

        TaskIterator taskIterator = new TaskListIterator(taskList);

        Mediator mediator = new TaskMediator();

        while (taskIterator.hasNext()) {
            Task task = taskIterator.next();
            Command taskCommand = new TaskCommand(task);
            taskCommand.execute();
            mediator.processTask(task);
        }
    }
}
