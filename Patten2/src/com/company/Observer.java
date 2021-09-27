package com.company;

import java.util.List;

public interface Observer {
    void update(List<String> tasks, String changed_task, String symbol);
}
