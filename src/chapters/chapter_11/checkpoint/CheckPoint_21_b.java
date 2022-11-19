package chapters.chapter_11.checkpoint;

public class CheckPoint_21_b {
    public static void main(String[] args) {
        new Person1().printPerson();
        new Student1().printPerson();
    }
}
class Student1 extends Person1 {
    private String getInfo() {    // There is no annototion for override so JVM dont invokes it
        return "Student";
    }
}
class Person1 {
    private String getInfo() {
        return "Person";
    }
    public void printPerson() {      // person
        System.out.println(getInfo());  // person
    }
}
