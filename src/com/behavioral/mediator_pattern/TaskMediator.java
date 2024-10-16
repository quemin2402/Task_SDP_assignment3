package com.behavioral.mediator_pattern;

import com.behavioral.chain_of_responsibility.*;

public class TaskMediator implements Mediator {
    private TaskHandler lowPriorityHandler;
    private TaskHandler mediumPriorityHandler;
    private TaskHandler highPriorityHandler;

    public TaskMediator() {
        this.lowPriorityHandler = new LowPriorityHandler();
        this.mediumPriorityHandler = new MediumPriorityHandler();
        this.highPriorityHandler = new HighPriorityHandler();

        lowPriorityHandler.setNextHandler(mediumPriorityHandler);
        mediumPriorityHandler.setNextHandler(highPriorityHandler);
    }

    @Override
    public void processTask(Task task) {
        lowPriorityHandler.handleTask(task);
    }
}
