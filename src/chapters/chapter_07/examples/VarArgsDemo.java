package chapters.chapter_07.examples;

public class VarArgsDemo {
    public static void main(String[] args) {
        printMax(34,3,3,8,2,56.5);
        printMax(new double[]{6,2.3,5});
        printMax(1, 2, 2, 1, 4);
        printMax(new double[]{1, 2, 3});
    }
    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double max = numbers[0];
        for (int i = 0;i < numbers.length;i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("The max is " + max);
    }
    public static void print(double a,String... strings){

    }
}
