package ru.gb.oop.controller;

import ru.gb.oop.model.Student;
import ru.gb.oop.model.StudyGroup;
import ru.gb.oop.model.Teacher;
import ru.gb.oop.model.User;
import ru.gb.oop.service.StudyGroupeService;
import ru.gb.oop.service.UserService;
import ru.gb.oop.view.ViewGroupe;

import javax.swing.text.View;
import java.util.List;

public class Controller {
    private UserService userService;
    private StudyGroupeService groupService;
    private ViewGroupe groupeView;

    public void start(){
        Controller controller =  new Controller();
        Student s1 = controller.createStudent(new Student(19, "Ivan", 1));
        Student s2 = controller.createStudent(new Student(25, "Petya", 2));
        Student s3 = controller.createStudent(new Student(23, "Igor", 3));

        Teacher t1 = controller.createTeacher(new Teacher(50, "Vitya", 1));
        Teacher t2 = controller.createTeacher(new Teacher(30, "Ilya", 2));
        StudyGroup group10 = controller.createGroup(123, t1, s1, s2);
        StudyGroup group3 = controller.createGroup(413, t2, s3);
        System.out.println(group10.toString());
        System.out.println(group3.toString());
    }

    public Controller() {
        userService = new UserService();
        groupeView = new ViewGroupe();
        groupService = new StudyGroupeService();
    }

    public Student createStudent(Student student) {
        return (Student) userService.create(student);
    }

    public Teacher createTeacher(Teacher teacher) {
        return (Teacher) userService.create(teacher);
    }

    public StudyGroup createGroup(Integer num, Teacher teacher, Student... students) {
        return groupService.CreateGroup(num, teacher, students);
    }

//    public void printStudents(Student student) {
//        groupeView.printStudent(student);
//    }

    public List<User> returnStudents() {
        return userService.read();
    }
}
