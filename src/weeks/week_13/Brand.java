package weeks.week_13;

public class Brand extends Car {
    private double price;
    private String color;
    private String driveType;
    private String transmission;
    private String make; //brand

    Brand() {

    }

    public Brand(String engineType, double weight, int horsePower, int numberOfDoors, String bodyStyle, String status,
                 double fuel, boolean engineON, double price, String color, String driveType, String transmission, String make) {
        super(engineType, weight, horsePower, numberOfDoors, bodyStyle, status, fuel, engineON);
        this.price = price;
        this.color = color;
        this.driveType = driveType;
        this.transmission = transmission;
        this.make = make;
    }

    Brand(double price, String color, String driveType, String transmission, String make) {
        this.price = price;
        this.color = color;
        this.driveType = driveType;
        this.transmission = transmission;
        this.make = make;
    }
}