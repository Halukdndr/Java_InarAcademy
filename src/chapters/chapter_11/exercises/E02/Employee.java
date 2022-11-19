package chapters.chapter_11.exercises.E02;

import chapters.chapter_10.exercises.MyDate;

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate myDate;

    public Employee() {
    }

    public Employee(String name, String address, int phoneNumber, String eMail, String office, double salary, MyDate myDate) {
        super(name, address, phoneNumber, eMail);
        this.office = office;
        this.salary = salary;
        this.myDate = myDate;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Class = Employee\nName = " + getName() + "\n";
    }
}
