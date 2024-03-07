package Lesson7.observer;

public class Master implements Observer {
    private int salary;
    private String name;

    public Master(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {

    }
}
