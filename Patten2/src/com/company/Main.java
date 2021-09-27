package com.company;

public class Main {

    public static void main(String[] args) {
        Trello team1_board = new Trello();

        team1_board.addTask("#0001 [BUG-FIX] Button delete not working");
        team1_board.addTask("#0002 [FEATURE] Add external collaborator feature.");

        Employee emp1 = new Employee("Toishybek Olzhas");
        Employee emp2 = new Employee("Walter White");
        Employee emp3 = new Employee("Jesse Pinkman");

        team1_board.registerObserver(emp1);
        team1_board.registerObserver(emp2);
        team1_board.registerObserver(emp3);

        team1_board.addTask("#0003 [FEATURE] Add translation to KZ");

        team1_board.unregisterObserver(emp2);

        team1_board.removeTask("#0002 [FEATURE] Add external collaborator feature.");

    }
}
