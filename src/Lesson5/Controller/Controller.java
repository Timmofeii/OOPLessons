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
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private StudentGroupView studentGroupView = new StudentGroupView();

    public void createStudent(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.STUDENT);
    }

    public void getAllStudent() {
        List<Student> studentList = service.getAllStudent();
        for (Student student : studentList) {
            studentView.printOnConsole(student);
        }
    }

    public void createTeacher(String firstName, String secondName,
                              String lastName, String dateB) {
        service.create(firstName, secondName, lastName, dateB, Type.TEACHER);
    }


    public StudyGroup createStudentGroupByID(int idTeacher, List<Integer> idStudentList) {

        return service.createLessonGroup(idTeacher, idStudentList);

    }

    public StudyGroup studentGroupByID(int TeacherID, List<Integer> StudentIDList) {

        return studyGroupService.studyGroupById(TeacherID, StudentIDList, service);

    }

    public void printGroupInfo(StudyGroup studyGroup) {
        studentGroupView.printStudentGroup(studyGroup);
    }


}