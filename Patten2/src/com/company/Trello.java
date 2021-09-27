package com.company;

import java.util.ArrayList;

public class Trello implements Observable{

    private ArrayList<String> tasks = new ArrayList<>();
    private ArrayList<Observer> employees = new ArrayList<>();

    @Override
    public void registerObserver(Observer employee) {
        this.employees.add(employee);

    }

    @Override
    public void unregisterObserver(Observer employee) {
        this.employees.remove(employee);
    }

    public void addTask(String task){
        this.tasks.add(task);
        sendNotifications(task, "Added ");
    }

    public void removeTask(String task){
        this.tasks.remove(task);
        sendNotifications(task, "Removed ");
    }

    private void sendNotifications(String changed_task, String add_or_remove){
        for (Observer employee: this.employees){
            employee.update(tasks, changed_task, add_or_remove);
        }
    }
}
