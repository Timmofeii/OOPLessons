package Lesson5.Data;

import java.util.List;

public class StudyGroup {
    private List<Student> studentList;
    private Teacher teacher;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.studentList = studentList;
        this.teacher = teacher;
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(teacher+"\n");
        for (Student student : studentList) {
            sb.append(student+"\n");
        }
        return sb.toString();
    }

}
