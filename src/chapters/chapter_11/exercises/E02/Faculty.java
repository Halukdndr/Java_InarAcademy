package chapters.chapter_11.exercises.E02;

import chapters.chapter_10.exercises.MyDate;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, int phoneNumber, String eMail, String office, double salary, MyDate myDate, String officeHours, String rank) {
        super(name, address, phoneNumber, eMail, office, salary, myDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
    @Override
    public String toString(){
        return "office hours: " + this.officeHours + "\nrank: " + this.rank;
    }
}
