package chapters.chapter_10.examples;

public class Course {
    private final int MAX_NUMBER_OF_STUDENTS = 60;
    private String name;
    private String[] students = new String[MAX_NUMBER_OF_STUDENTS];
    private int numberOfStudents;

    public Course(String name) {
        this.name = name;
    }
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
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
