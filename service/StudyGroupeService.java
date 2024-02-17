package ru.gb.oop.service;

import ru.gb.oop.model.Student;
import ru.gb.oop.model.StudyGroup;
import ru.gb.oop.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupeService {
    public StudyGroup CreateGroup(Integer num, Teacher teacher, Student... students) {
        ArrayList<Student> listStudents = new ArrayList<>();
        for (Student student : students) {
            listStudents.add(student);
        }
        return new StudyGroup(num, teacher, listStudents);
    }

}
