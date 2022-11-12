package chapters.chapter_10.exercises;

import java.util.Arrays;

public class Course {
    private final int MAX_NUMBER_OF_STUDENTS = 2;
    private String name;
    private String[] students = new String[MAX_NUMBER_OF_STUDENTS];
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
    }
    public void addStudent(String student){
        numberOfStudents++;
        if (numberOfStudents >= students.length){
            String[] temp = new String[students.length * 2];
            System.arraycopy(students,0,temp,0,students.length);
            students = temp;
        }
        students[numberOfStudents - 1] = student;

    }
    public void dropStudent(String student){
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].equals(student)){
                for (int j = i ; j < numberOfStudents - 1; j++) {
                    students[j] = students[j + 1];
                }
            }
        }
        numberOfStudents--;
    }
    public void clear(){
        Arrays.fill(students,null);
        this.numberOfStudents = 0;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    public String toString() {
        String result = "";
        for (int i = 0; i < numberOfStudents; i++) {
            result += students[i] + " , ";
        }
        return "{" + result + "}";
    }
}
