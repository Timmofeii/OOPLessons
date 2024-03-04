package Lesson5.Controller;

import Lesson5.Data.*;
import Lesson5.Service.DataService;
import Lesson5.Service.StudyGroupService;
import Lesson5.View.StudentGroupView;
import Lesson5.View.StudentView;

import java.util.List;

public class Controller {
    private final DataService service = new DataService();
    private final StudentView studentView = new StudentView();
    private  StudyGroupService studyGroupService ;
    private StudentGroupView studentGroupView;

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void getAllStudent() {
        List<User> userList = service.getAllStudent();
        for (User user : userList) {
            studentView.printOnConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }


    public void getAllGroup(){
        System.out.println(studyGroupService.getStudyGroup().getTeacher());
        for (Student student : studyGroupService.getStudyGroup().getStudentList()) {
            System.out.println(student);
        }
    }

    public void createStudentGroup(Teacher teacher, List<Student> studentGroup) { studyGroupService =new StudyGroupService(teacher,studentGroup);
    }


}