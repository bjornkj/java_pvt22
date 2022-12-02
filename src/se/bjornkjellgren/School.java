package se.bjornkjellgren;

import java.util.ArrayList;
import java.util.List;

public class School {

    public static void main(String[] args) {
        Student s = new Student("Kalle", "Anka", (short) 1925);
        Teacher t = new Teacher("Knatte", "Anka", (short) 1955, "sdfklja@asdjkf.com", "12345");
        Dog d = new Dog("Pluto");
//        s.sayHello();
//        s.greet();

        List<Greeter> l = new ArrayList<>();
        l.add(s);
        l.add(t);
        l.add(d);

        for(Greeter g : l){
            g.greet();
        }


        Course c = new Course("123", "Programmering");
        c.addTeacher(t);
        c.enroll(s);

    }
}
