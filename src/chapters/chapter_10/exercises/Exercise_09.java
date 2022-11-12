package chapters.chapter_10.exercises;

import java.util.Arrays;

public class Exercise_09 {
    public static void main(String[] args) {
        Course math = new Course("math");
        math.addStudent("haluk");
        math.addStudent("cafer");
        math.addStudent("zafer");
        math.addStudent("selcuk");
        math.addStudent("talha");
        System.out.println(math.toString());
        math.clear();
        math.addStudent("carl");
        math.addStudent("jack");
        math.addStudent("judith");
        math.dropStudent("jack");
        System.out.println(math.toString());

    }
}
