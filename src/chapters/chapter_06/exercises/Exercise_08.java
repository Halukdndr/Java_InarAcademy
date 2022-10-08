package chapters.chapter_06.exercises;

public class Exercise_08 {
    public static void main(String[] args) {
        titleOfTable();
        for (int i = 0;i <10;i++){
            double c = 40.0;
            double f = 120.0;
                System.out.printf("%2.1f",(c - i));
                System.out.printf("%6s"," ");
                System.out.printf("%-5.1f",celsiusToFahrenheit(c - i));
                System.out.printf("%8s"," ");
                System.out.print("|   ");
                System.out.printf("%-5.1f",(f - (i * 10)));
                System.out.printf("%8s"," ");
                System.out.printf("%4.2f\n",fahrenheitToCelsius(f - (i * 10)));
        }

    }

    private static void titleOfTable() {
        System.out.println("Celsius   Fahrenheit   |   Fahrenheit   Celsius");
        System.out.println("_______________________________________________");
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
