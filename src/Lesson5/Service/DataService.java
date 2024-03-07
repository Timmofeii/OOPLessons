package Lesson5.Service;

import Lesson5.Data.*;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName,
                       String lastName, String dateB, Type type){
        int id = getFreeId(type);
        if(Type.STUDENT == type){
            Student student = new Student(firstName,secondName,lastName,dateB,id);
            userList.add(student);
        }
        else if(Type.TEACHER == type){

            Teacher teacher = new Teacher(firstName,secondName,lastName,dateB,id);
            userList.add(teacher);
        }
    }

    private int getFreeId(Type type){
        boolean itsStudent = Type.STUDENT == type;
        int lastId = 1;
        for (User user : userList) {
            if(user instanceof Teacher && !itsStudent){
                lastId = ((Teacher) user).getTeacherId() + 1;
            }
            if(user instanceof Student && itsStudent){
                lastId = ((Student) user).getStudentId() + 1;
            }

        }
        return lastId;
    }

    public User getUserById(Type type, int id){
        boolean itsStudent = Type.STUDENT == type;
        for(User user: userList){
            if(user instanceof Teacher && !itsStudent && ((Teacher) user).getTeacherId() == id){
                return user;
            }
            if(user instanceof Student && itsStudent && ((Student) user).getStudentId() == id){
                return user;
            }
        }
        return null;
    }
    public List<User> getAllUser(){
        return userList;
    }

    public List<Student> getAllStudent(){
        List<Student> resultList = new ArrayList<>();
        for(User user : userList){
            if (user instanceof Student){
                resultList.add((Student) user);
            }
        }
        return resultList;
    }

    public Teacher getTeacherByID(int separatorID) {
        Teacher teacher=null;
        for (User user : userList) {
            if(user instanceof Teacher&& ((Teacher)user).getTeacherId()==separatorID){
                teacher= (Teacher) user;
                return teacher;
            }
        }
        System.out.println("Not found(");
        return teacher;
    }
    public StudyGroup createLessonGroup(int teacherForLessonId, List<Integer> studentForLessonId) {
        Teacher teacherForLesson = null;
        List<Student> studentsForLesson = new ArrayList<>();

        //поиск учителя
        for (User user : userList) {
            if (user instanceof Teacher && ((Teacher) user).getTeacherId() == teacherForLessonId)
                teacherForLesson = (Teacher) user;
        }
        //поиск студенов
        for (User user : userList) {
            for (Integer i : studentForLessonId) {
                if (user instanceof Student && ((Student) user).getStudentId()==(i))
                    studentsForLesson.add((Student) user);
            }
        }
        return new StudyGroup(teacherForLesson, studentsForLesson);
    }

}