package Lesson5;

import Lesson5.Data.Student;
import Lesson5.Controller.Controller;
import Lesson5.Data.Teacher;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

            Controller controller = new Controller();
        List<Student> studentGroup = Arrays.asList(

                new Student("4", "aab", "aab", "aab",2),
                new Student("2", "aaa", "aaa", "aaa",3),
                new Student("3", "Aaa", "Aaa", "Aaa",4),
                new Student("1", "bbb", "bbb", "bbb",4));

           Teacher teacher= new Teacher("One", "Serg", "Gog","3211",1);




            controller.getAllStudent();
            controller.createStudentGroup(teacher,studentGroup);
            controller.getAllGroup();

        }
    }

