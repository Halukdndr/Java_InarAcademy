package weeks.week_12;

public class TestHome {
    public static void main(String[] args) {
        Home myHome = new Home();
        myHome.setSquareFeet(120);
        myHome.setNumberOfBath(1);
        myHome.setNumberOfRoom(3);
        myHome.setPrice(100_000);
        myHome.setRent(900.99);
        myHome.printProperties();
    }
}
