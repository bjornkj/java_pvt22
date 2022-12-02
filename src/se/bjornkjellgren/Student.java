package se.bjornkjellgren;

public class Student extends Person implements Greeter{

    public Student(String firstName, String lastName, Short birthYear) {
        super(firstName, lastName, birthYear);
    }


    public void sayHello(){
        System.out.println("Studenten " + getFirstName() + " säger hej");
    }

    public void greet(){
        System.out.println("Studenten " + getFirstName() + " " + getLastName() + " säger hej");
    }
}
