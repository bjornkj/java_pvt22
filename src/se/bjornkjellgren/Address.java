package se.bjornkjellgren;


public class Address {
    private String street;
    private String streetNo;
    private String zipCode;
    private String city;


    public Address(String street, String streetNo, String zipCode, String city){
        this.street = street;
        this.streetNo = streetNo;
        this.zipCode = zipCode;
        this.city = city;
    }

    public String toString(){
        return "Address{" +
                "street=" + street +
                " street number=" + streetNo +
                " zip code=" + zipCode +
                " city=" + city +
                "}";
    }

    public static void main(String[] args) {
        Address a = new Address("En gata", "9b", "51196", "En stad");
        System.out.println(a);
    }
}
