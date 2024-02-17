package ru.gb.oop.model;

public class Student extends User{
    private int studentId;



    public Student(Integer age, String name, int studentId) {
        super(age, name);
        this.studentId = studentId;
    }




    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public void setStudentId(int i) {
    }
}

