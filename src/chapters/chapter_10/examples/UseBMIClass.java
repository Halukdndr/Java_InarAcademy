package chapters.chapter_10.examples;

public class UseBMIClass {
    public static void main(String[] args) {
        BMI bmi1 = new BMI("Kim Yang",18,145 * 0.45359237,70 * 0.0254);
        BMI bmi2 = new BMI("Susan King",215 * 0.45359237,70 * 0.0254);
        System.out.println("The BMI for " + bmi1.getName() + " is " + bmi1.getBMI() + " " + bmi1.getStatus());
        System.out.println("The BMI for " + bmi2.getName() + " is " + bmi2.getBMI() + " " + bmi2.getStatus());
    }
}
