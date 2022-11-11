package chapters.chapter_09.exercises;

public class Exercise_08 {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.switchOn();

        Fan fan2 = new Fan();
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);

        fan1.display();
        System.out.println("-----------");
        fan2.display();

    }
}
