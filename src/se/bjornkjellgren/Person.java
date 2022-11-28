package se.bjornkjellgren;

public class Person {
    /*
    En person skall ha
    förnamn
    efternamn
    födelseår
    adress
     */
    private String firstName;
    private String lastName;
    private Short birthYear;
    private Address address;

    /*
    För heltal har vi ett antal olika typer att välja på
    byte, 1 byte lång, kan lagra tal mellan -128 upp till 127
    short, 2 byte lång, kan lagra tal mellan -32768 upp till 32767
    int, 4 bytes lång, kan lagra tal mellan -2,147,483,648 upp till 2,147,483,647
    long, 8 bytes lång, -9,223,372,036,854,775,808 upp till 9,223,372,036,854,775,807
     */

    public Person(String firstName, String lastName, Short birthYear){
        this(firstName, lastName, birthYear, new Address("", "", "", ""));
    }

    public Person(String firstName, String lastName, Short birthYear, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.address = address;
    }
    /* Vi har två konstruktorer med olika mängd argument. Vilken som används beror på de argument som skickas
    med när vi gör new Person()
     */

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Short getBirthYear() {
        return birthYear;
    }

    public Address getAddress() {
        return address;
    }


    public void sayHello(){
        System.out.println("Hejsan, jag är en Person som heter " + getFirstName());
    }

    public String toString() {
        return "Person{" +
                "first name=" + firstName +
                ", last name=" + lastName +
                ", birth year=" + birthYear +
                "m address=" + address +
                "}";
    }



    public static void main(String[] args) {
        Person b = new Person("Björn", "Kjellgren", (short) 1980);
        Person l = new Person("Louise", "Kjellgren", (short) 1982, new Address("Gatan", "13", "123123", "Staden"));
        System.out.println(b);
        System.out.println(l);

        l.sayHello();
    }
}
