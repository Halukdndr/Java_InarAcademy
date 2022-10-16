package chapters.chapter_07.checkpoints;

public class CheckPoint_28 {
    public static void main(String[] args) {
        int[] list1 = {2, 4, 7, 10};
        java.util.Arrays.fill(list1, 7);
        System.out.println(java.util.Arrays.toString(list1)); //[7,7,7,7]
        int[] list2 = {2, 4, 7, 10};
        System.out.println(java.util.Arrays.toString(list2));   //[2,4,7,10]
        System.out.print(java.util.Arrays.equals(list1, list2));   // false
    }
}
