package com.company;

import java.sql.SQLOutput;
import java.util.List;

public class Employee implements Observer{

    private String full_name;

    public Employee(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public void update(List<String> tasks, String task, String symbol) {
        System.out.println("[NOTIFICATION] " + full_name + ", tasks of your team was recently updated: \n" +
                symbol + task + "\n"+
                "The whole board now: \n"
                + tasks);
    }
}
