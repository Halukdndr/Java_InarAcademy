package weeks.week_12;

public class Home {
    // data field
    private double squareFeet;
    private int numberOfBath;
    private int numberOfRoom;
    private boolean isThereGarage;
    private double price;
    private double rent;
    private String direction;
    private int year;

    // no-arg constructor
    public Home(){
        this(15,0,1,false,1000,10,"north",100);
    }
    // constructor
    public Home(double squareFeet,int numberOfBath,int numberOfRoom,boolean isThereGarage,double price,double rent,String direction,int year){
        this.squareFeet = squareFeet;
        this.numberOfBath = numberOfBath;
        this.numberOfRoom = numberOfRoom;
        this.isThereGarage = isThereGarage;
        this.price = price;
        this.rent = rent;
        this.direction = direction;
        this.year = year;
    }

    public double getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(double squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getNumberOfBath() {
        return numberOfBath;
    }

    public void setNumberOfBath(int numberOfBath) {
        this.numberOfBath = numberOfBath;
    }

    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public boolean isThereGarage() {
        return isThereGarage;
    }

    public void setThereGarage(boolean thereGarage) {
        isThereGarage = thereGarage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getDirection() {
        return direction;
    }

    public int getYear() {
        return year;
    }
    public void printProperties(){
        System.out.println("Square-feet: " + this.squareFeet);
        System.out.println("Number of bath: " + this.numberOfBath);
        System.out.println("Number of room: " + this.numberOfRoom);
        System.out.println("Garage: " + (this.isThereGarage ? "yes" : "no"));
        System.out.println("Price: " + this.price);
        System.out.println("Rent: " + this.rent);
        System.out.println("Direction: " + this.direction);
        System.out.println("Year: " + this.year);

    }
    public void renovation(){
        this.price = this.price * 1.1;
        this.rent = this.rent * 1.2;
    }
}
