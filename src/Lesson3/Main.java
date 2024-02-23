package Lesson3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList111 = Arrays.asList(
                new Student(4, "aab", "aab", "aab"),
                new Student(2, "aaa", "aaa", "aaa"),
                new Student(3, "Aaa", "Aaa", "Aaa"),
                new Student(1, "bbb", "bbb", "bbb"));
        List<Student> studentList222 = Arrays.asList(
                new Student(4, "aab", "aab", "aab"),
                new Student(2, "aaa", "aaa", "aaa"));
        List<Student> studentList333 = Arrays.asList(
                new Student(4, "aab", "aab", "aab"));

        StudentGroup studentGroup1 = new StudentGroup(studentList111, 111);
        StudentGroup studentGroup2 = new StudentGroup(studentList222, 222);
        StudentGroup studentGroup3 = new StudentGroup(studentList333, 333);


        List<StudentGroup> studentGroupList = new ArrayList<>();
        studentGroupList.add(studentGroup1);
        studentGroupList.add(studentGroup2);
        studentGroupList.add(studentGroup3);
        System.out.println();
        Stream stream = new Stream(studentGroupList);

        for (StudentGroup group : stream) {
            System.out.println(group);
        }
        System.out.println();
        StreamService service = new StreamService(stream);
        for (StudentGroup group : service.getSortedStream()) {
            System.out.println(group);
        }
    }
}