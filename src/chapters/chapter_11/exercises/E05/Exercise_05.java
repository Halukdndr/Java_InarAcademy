package chapters.chapter_11.exercises.E05;

import java.util.ArrayList;

public class Exercise_05 {
    public static void main(String[] args) {
        Course c1 = new Course("Inar 2023.03");

        c1.addStudent("Serhat Gulbas");
        c1.addStudent("Furkan Sener");
        c1.addStudent("Berk Orman");
        c1.addStudent("Sinan Cetin");
        c1.addStudent("Haluk Dundar");
        c1.addStudent("Uzeyir Sur");
        c1.addStudent("Mesut Ozturk");
        c1.addStudent("Ertugrul Donmez");

        ArrayList<String> students = c1.getStudents();
        System.out.println("After adding some students.");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("Number of students: " + c1.getNumberOfStudents());
        System.out.println("------------------");

        c1.dropStudent("Ertugrul Donmez");
        c1.dropStudent("Mesut Ozturk");
        c1.dropStudent("Kemal Tanca");
        students = c1.getStudents();
        students = c1.getStudents();
        System.out.println("After dropping some students");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
        System.out.println("Number of students: " + c1.getNumberOfStudents());


    }
    }

