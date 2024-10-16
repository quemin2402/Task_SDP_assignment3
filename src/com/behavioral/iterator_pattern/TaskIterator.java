package com.behavioral.iterator_pattern;

import com.behavioral.chain_of_responsibility.Task;

public interface TaskIterator {
    boolean hasNext();
    Task next();
}
