package chapters.chapter_11.exercises.E05;

import java.util.ArrayList;

public class Course {
    private final int MAX_NUMBER_OF_STUDENTS = 60;
    private String name;
    private ArrayList<String> students = new ArrayList<>(MAX_NUMBER_OF_STUDENTS);
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
    }
    public void addStudent(String student){
        students.add(student);
        numberOfStudents++;
    }
    public void dropStudent(String student){
        for (int i = 0; i < numberOfStudents; i++) {
            if (students.contains(student)){
                students.remove(student);
                numberOfStudents--;
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String toString() {
        String result = "";
        for (int i = 0; i < students.size(); i++) {
            result += students.indexOf(i) + " , ";
        }
        return "{" + result + "}";
    }
}
