package Lesson6.HomeWork6;

public class Student extends User implements Comparable<Student>{


    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    private  int studId;

    public Student( int studId ,String firstName, String secondName, String lastName) {
        super( firstName, secondName, lastName);
        this.studId = studId;
    }



    @Override
    public int compareTo(Student o) {
        if(studId > o.getStudId())
            return 1;
        if(studId < o.getStudId())
            return -1;
        return 0;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studId +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", LastName='" + super.getLastName() + '\'' +
                '}'+'\n';
    }
}