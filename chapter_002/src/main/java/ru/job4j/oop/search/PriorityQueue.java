package ru.job4j.oop.search;

import java.util.LinkedList;

public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<Task>();

    public void put(Task task) {
        int index = 0;
        for (var element : tasks) {
            if (element.getPriority() <= task.getPriority()) {
                index++;
            } else if (element.getPriority() > task.getPriority()){
                break;
            }
        }
        this.tasks.add(index, task);
    }

    public Task take() {
        return tasks.remove(0);
    }
}
