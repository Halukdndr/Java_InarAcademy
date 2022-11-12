package chapters.chapter_10.exercises;

import java.util.Arrays;

public class Exercise_10 {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 20 + 1);
            queue.enqueue(num);
        }
        System.out.println(queue.toString());
        int limit = queue.getSize();
        for (int i = 0; i < limit; i++) {
            System.out.print(queue.dequeue() + " ");
        }
    }
}
