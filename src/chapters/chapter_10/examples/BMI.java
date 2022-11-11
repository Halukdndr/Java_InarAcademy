package chapters.chapter_10.examples;

public class BMI {
    private String name;
    private int age;
    private double weight; // in kilograms
    private double height; // in meters

    public BMI(){}

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
        return Math.round((this.weight / Math.pow(this.height,2) * 100)) / 100.0;
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
