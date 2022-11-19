package chapters.chapter_11.exercises.E02;

import chapters.chapter_10.exercises.MyDate;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, int phoneNumber, String eMail, String office, double salary, MyDate myDate, String title) {
        super(name, address, phoneNumber, eMail, office, salary, myDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString(){
        return "title: " + this.title;
    }
}
