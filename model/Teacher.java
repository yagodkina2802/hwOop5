package ru.gb.oop.model;

public class Teacher extends User{
    private int TeacherId;


    public Teacher(Integer age, String name, int teacherId) {
        super(age, name);
        TeacherId = teacherId;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "TeacherId=" + TeacherId +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setTeacherId(int i) {
    }
}


