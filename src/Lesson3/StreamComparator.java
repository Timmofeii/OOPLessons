package Lesson3;

import java.util.Comparator;

public class StreamComparator implements Comparator<StudentGroup> {
    /**
     *
     * @param o1 принимает первый обьект List<StudentGroup>
     * @param o2 принимает второй обьект List<StudentGroup>
     * @return возращает отрицательное число, если размер порвого списка больше чем второго,
     * 0 если размеры списков равны
     * и положительное число, если первый список больше второго
     */
    @Override//firs<second return-> -1
    //firs==second return-> 0
    //first>second return-> 1
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getStudentList().size() - o2.getStudentList().size();

    }
}
