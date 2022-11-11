package chapters.chapter_09.exercises;

public class Fan {
   public static final int SLOW = 1;
   public static final int MEDIUM = 2;
   public static final int FAST = 3;
    private int speed;
    private  boolean on;
    private double radius;
    private String color;

    public Fan(){
        this(SLOW,false,5,"blue");
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void switchOn() {
        this.on = true;
    }
    public void switchOff() {
        this.on = false;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void display(){
        if(this.on){
            System.out.println("Speed: " + this.speed);
            System.out.println("Color: " + this.color);
            System.out.println("radius: " + this.radius);
        }else {
            System.out.println("Fan is off");
            System.out.println("Color: " + this.color);
            System.out.println("Radius: " + this.color);
        }
    }
}