package Lesson7.observer;

public class Student implements Observer {
    private int salary;
   private String name;

    public Student(int salary, String name) {
        this.salary = 0;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
         if(salary>getSalary()){
             System.out.println("change work");
         }
    }
}
