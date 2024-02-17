package ru.gb.oop.view;

import ru.gb.oop.model.Student;
import ru.gb.oop.model.StudyGroup;

import java.util.List;

public class ViewGroupe {
    public void printUser(StudyGroup studyGroup){
        System.out.println("Группа " + studyGroup);
    }

    public void printStudent(List<Student> students) {
        System.out.println("Список всех студентов - "+ students);
    }
}
