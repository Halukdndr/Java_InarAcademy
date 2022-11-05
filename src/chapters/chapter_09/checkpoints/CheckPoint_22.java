package chapters.chapter_09.checkpoints;

public class CheckPoint_22 {
        private double radius = 1;

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public static void main(String[] args) {
            CheckPoint_22 myCircle = new CheckPoint_22();
            System.out.println("Radius is " + myCircle.radius);
        }
    }
    // No it does not cause problem but it is nonsense
