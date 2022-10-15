package weeks.week_09;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = new int[10];
        fillTheArrayRandomly(arr);
        System.out.println("The max value is " + getTheMax(arr));
        System.out.println("The second max value is " + getSecondMax(arr));
        printArray(arr);

    }

    public static int getSecondMax(int[] array) {
        int secondMax = 0;
        for (int i = 0;i < array.length;i++){
            if (array[i] > secondMax && array[i] < getTheMax(array)){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static int getTheMax(int[] array) {
        int max = array[0];
        for (int i = 1;i < array.length;i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    private static void printArray(int[] array) {
        for (int e: array) {
            System.out.printf("%2d",e);
        }
    }

    public static void fillTheArrayRandomly(int[] arr) {

        for (int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * arr.length);
        }
    }
}
