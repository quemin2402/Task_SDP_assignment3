package com.behavioral.mediator_pattern;

import com.behavioral.chain_of_responsibility.Task;

public interface Mediator {
    void processTask(Task task);
}
