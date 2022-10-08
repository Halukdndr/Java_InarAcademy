package chapters.chapter_06.exercises;

public class Exercise_09 {
    public static void main(String[] args) {
        double f = 1.0;
        double m = 20.0;
        printTitle();
        for (int i = 0;i < 10;i++){
            System.out.printf("%4.1f",(f + i));
            System.out.printf("%5s", " ");
            System.out.printf("%5.3f",footToMeter(f + i));
            System.out.printf("%5s|%5s"," "," ");
            System.out.printf("%2.1f",(m + (i * 5)));
            System.out.printf("%5s"," ");
            System.out.printf("%3.3f\n",meterToFoot((m + (i * 5))));
        }
    }
    public static void printTitle(){
        System.out.println("Feet     Meters    |     Meters   Feet");
        System.out.println("__________________________________________");
    }
    public static double footToMeter(double foot){
      double meter = 0.305 * foot;
      return meter;
    }
    public static double meterToFoot(double meter){
        double foot = 3.279 * meter;
        return foot;
    }
}
