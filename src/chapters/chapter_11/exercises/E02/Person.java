package chapters.chapter_11.exercises.E02;

public class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String eMail;

    public Person() {
    }

    public Person(String name, String address, int phoneNumber, String eMail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    @Override
    public String toString(){
        return "name: " + this.name + "\naddress: " + this.address + "\nphone number: " + this.phoneNumber + "\nemail: " + this.eMail;
    }
}
