package chapters.chapter_11.exercises.E10;

import javafx.scene.shape.Circle;

public class Exercise_10 {
    public static void main(String[] args) {
        MyStack list = new MyStack();
        list.push("inar");
        list.push("haluk");
        list.push(26);
        list.push(new Circle(5));
        System.out.println(list.getSize());
        System.out.println(list.peek());
        list.pop();
        display(list);
    }

    public static void display(MyStack stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop().toString());
        }
    }
}