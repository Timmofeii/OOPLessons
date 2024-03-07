package Lesson5.Service;

import Lesson5.Data.Student;
import Lesson5.Data.StudyGroup;
import Lesson5.Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService {
    StudyGroup studyGroup;

    public StudyGroup studyGroupById(int idTeacher,List<Integer>idStudentList,DataService service) {

        List<Student> studentList = service.getAllStudent();
        Teacher teacherByGroup ;
        teacherByGroup=service.getTeacherByID(idTeacher);
        List<Student> currentStudent = new ArrayList<>();
        for (Student student : studentList) {
            for (Integer separatorID : idStudentList) {
                if (student.getStudentId() == separatorID) {
                    currentStudent.add(student);
                }
            }

        }
        return new StudyGroup(teacherByGroup, currentStudent);

    }


    public StudyGroup getStudyGroup() {
        return studyGroup;
    }

}
