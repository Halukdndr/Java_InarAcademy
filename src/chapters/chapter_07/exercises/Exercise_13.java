package chapters.chapter_07.exercises;

public class Exercise_13 {
    public static void main(String[] args) {
        int[] numbers = new int[54];
        for (int i = 0;i < numbers.length;i++){
            numbers[i] = i + 1;
        }
        System.out.println(getRandom(numbers));
    }
    public static int getRandom(int... numbers){
        return numbers[(int)(Math.random() * numbers.length)];
    }
}
