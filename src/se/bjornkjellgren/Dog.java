package se.bjornkjellgren;

public class Dog implements Greeter{
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public void greet() {
        System.out.println("Voof");
    }
}
