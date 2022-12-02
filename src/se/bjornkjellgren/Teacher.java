package se.bjornkjellgren;

public class Teacher extends Person implements Greeter{
    private String email;
    private String phoneNo;

    public Teacher(String firstName, String lastName, Short birthYear, String email, String phoneNo) {
        super(firstName, lastName, birthYear);
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public void greet(){
        System.out.println("Hej, jag är läraren " + getFirstName() + " min mailadress är " + email);
    }
}
