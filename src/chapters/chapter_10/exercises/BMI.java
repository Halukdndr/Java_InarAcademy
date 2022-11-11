package chapters.chapter_10.exercises;

public class BMI {
    private String name;
    private int age;
    private double weight;
    private double height;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;


    public BMI(String name, int age, double weight, double feet,double inches){
        this(name,age,weight,(feet * 12 ) + inches);
    }
    public BMI(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public BMI(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }
    public double getBMI(){
        return Math.round(((this.weight * KILOGRAMS_PER_POUND)/ Math.pow((this.height * METERS_PER_INCH),2) * 100)) / 100.0;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getStatus(){
        if (getBMI() < 18.5){
            return "Underweight";
        } else if (getBMI() < 25) {
            return "Normal";
        } else if (getBMI() < 30) {
            return "Overweight";
        }else {
            return "Obese";
        }
    }
}
