package chapters.chapter_07.checkpoints;

public class CheckPoint_06 {
    public static void main(String[] args) {
        int[] myList;   // Declare
        myList = new int[5];  // Create

        for (int i = 0;i < myList.length;i++){  // Assign
            myList[i] = (int)(Math.random() * 10);
        }

        System.out.println(myList[0]); // Access myList[index]

    }
}
