package chapters.chapter_11.exercises.E06;

import chapters.chapter_10.examples.Loan;
import chapters.chapter_11.exercises.E06.Circle;
import java.util.ArrayList;
import java.util.Date;

public class Exercise_06 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        Object cirle = new Circle(5);
        Object loan = new Loan();
        Object date = new Date();
        list.add(cirle);
        list.add(loan);
        list.add(date);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }
    }
}

