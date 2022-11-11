package chapters.chapter_10.exercises;


public class Exercise_02 {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang",18,145 ,70);
        BMI bmi2 = new BMI("Susan King",215,70 );
        BMI bmi3 = new BMI("Haluk",26,169.76,5,2.992125984);

        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
        System.out.println("The BMI for " + bmi3.getName() + " is " + bmi3.getBMI() + " " + bmi3.getStatus());
    }
}
