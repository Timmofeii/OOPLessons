package Lesson6.HomeWork6;

public class Teacher extends User{
     private String speciality;

    public Teacher(String firstName, String secondName, String lastName, String speciality) {
        super(firstName, secondName, lastName);
        this.speciality = speciality;
    }
@Override
     public String toString(){
    return "Teacher speciality: '"+speciality+"' {"+getFirstName()+" "+getSecondName()+"}";
}

}
