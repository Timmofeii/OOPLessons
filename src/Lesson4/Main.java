package Lesson4;



import java.util.Arrays;

import java.util.List;

/**
 *

 Задача 1
 � Создать класс Юзер и перенести в него базовые поля ( ФИО )
 � Модифицировать ранее созданный класс СтудентКомпаратор
 � Переименовать в ЮзерКомпаратор
 � Типизировать его T наследующегося от типа Юзер ( T extends User )
 � Типизировать реализуемый интерфейс Компаратор T
 � Изменить метод компаре, внеся во входные данные вместо конкретных
 классов типизацию T
 � Внести правки места, где использовался предыдущий компаратор

 Задача 2
 � Создать интерфейс ЮзерВью
 � Типизировать его T наследующегося от типа Юзер
 � Создать в нем метод sendOnConsole(List<Student> students) используя
 типизацию
 � Создать класс СтудентВью реализующий созданный интерфейс
 — Создать класс УчительСервис и реализовать аналогично проделанному на семинаре;
 — Создать класс УчительВью и реализовать аналогично проделанному на семинаре;

 Формат сдачи: ссылка на гитхаб проект*/
public class Main {
    public static void main(String[] args) {
        List<Student> studentGroup = Arrays.asList(
                new Student(4, "aab", "aab", "aab"),
                new Student(2, "aaa", "aaa", "aaa"),
                new Student(3, "Aaa", "Aaa", "Aaa"),
                new Student(1, "bbb", "bbb", "bbb"));

        List<Teacher> teacherList = Arrays.asList(
                new Teacher("Jon", "Bush", "simple", "IT"),
                new Teacher("Bob", "Sponge", "yellow", "aqua"),
                new Teacher("Ken", "Barby", "Pink", "Happy"),
                new Teacher("Tim", "Terner", "Bolshakov", "OldCook"));

        StudentView studentView = new StudentView();
        studentView.sendOnConsole(studentGroup);

        TeacherView teacherService = new TeacherView();
        teacherService.sendOnConsole(teacherList);
    }
}
