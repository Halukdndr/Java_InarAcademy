package chapters.chapter_09.checkpoints;

import javafx.scene.shape.Circle;

public class CheckPoint_19 {
    // No
    // Yes
    public static void main(String[] args) {

        CheckPoint_19 c = new CheckPoint_19();
        c.method1();
    }
    public void method1(){
        method2();
    }

    public static void method2() {
   //     System.out.println("What is radius " + c.getRadius()); // cannot access an instance method from static method
    }
    Circle c = new Circle();

}
