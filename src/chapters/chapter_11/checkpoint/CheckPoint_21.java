package chapters.chapter_11.checkpoint;

public class CheckPoint_21 {
    public static void main(String[] args) {
        new Person1().printPerson();
        new Student1().printPerson();
    }
}
class Student extends Person {
    @Override
    public String getInfo() {
        return "Student";
    }
}
class Person {
    public String getInfo() {
        return "Person";
    }
    public void printPerson() {                 // person
        System.out.println(getInfo());          // student
    }
}
