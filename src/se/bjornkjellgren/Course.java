package se.bjornkjellgren;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String id;
    private String name;
    private List<Student> students;
    private List<Teacher> teachers;

    public Course(String id, String name){
        this.id = id;
        this.name = name;

        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }


    /*
    lägga till och ta bort lärare
    lägga till och ta bort studenter
    Skriva ut kursen, id, namn, lärare och studenter
     */
    public void addTeacher(Teacher t){
        teachers.add(t);
    }

    public  void enroll(Student s){
        students.add(s);
    }

    public void removeTeacher(Teacher t){
        teachers.remove(t);
    }
}
