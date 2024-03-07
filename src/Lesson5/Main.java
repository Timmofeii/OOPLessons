package Lesson5;

import Lesson5.Data.Student;
import Lesson5.Controller.Controller;
import Lesson5.Data.Teacher;
import Lesson5.View.StudentGroupView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

Controller controller = new Controller();
        StudentGroupView studentGroupView= new StudentGroupView();
controller.createStudent("1Name","1Second","1last","1");
controller.createStudent("2Name","2Second","2last","2");
controller.createStudent("3Name","3Second","3last","3");
controller.createStudent("4Name","4Second","4last","4");
controller.createTeacher("Tname1","TsecondName","TlastName","1");
controller.createTeacher("Tname2","TsecondName2","TlastName2","2");
      //  controller.(controller.createStudentGroupByID(1, Arrays.asList(1, 2, 3)));
        controller.printGroupInfo(controller.studentGroupByID(1, Arrays.asList(1, 2, 3)));


    }
}

