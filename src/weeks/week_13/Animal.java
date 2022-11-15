package weeks.week_13;

public class Animal {
    double weight;
    double height;
    boolean canSwim;
    boolean canFly;

    public Animal() {
        this(0,0,false,false);
    }

    public Animal(double weight, double height, boolean canSwim, boolean canFly) {
        this.weight = weight;
        this.height = height;
        this.canSwim = canSwim;
        this.canFly = canFly;
    }

    public void runs(){
        System.out.println("It's running");
    }
    public void eats(){
        System.out.println("It's eating.");
    }
    public void sleeps(){
        System.out.println("It's sleeping.");
    }

}
