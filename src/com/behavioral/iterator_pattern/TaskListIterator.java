package com.behavioral.iterator_pattern;

import com.behavioral.chain_of_responsibility.Task;
import java.util.List;

public class TaskListIterator implements TaskIterator {
    private List<Task> tasks;
    private int position = 0;

    public TaskListIterator(List<Task> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean hasNext() {
        return position < tasks.size();
    }

    @Override
    public Task next() {
        return tasks.get(position++);
    }
}
