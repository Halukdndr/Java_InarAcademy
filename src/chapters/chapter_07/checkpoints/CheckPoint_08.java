package chapters.chapter_07.checkpoints;

public class CheckPoint_08 {
    public static void main(String[] args) {
         // a. Create an array to hold 10 double values.
        double[] arr = new double[10];

         // b. Assign the value 5.5 to the last element in the array.
         arr [arr.length - 1] = 5.5;

         //c. Display the sum of the first two elements.
        System.out.println(arr[0] + arr[1]);

         //d. Write a loop that computes the sum of all elements in the array.
        double sum = 0;
        for (int i = 0;i < arr.length;i++){
            sum += arr[i];
        }

         //e. Write a loop that finds the minimum element in the array.
        double min = arr[0];
        for (int i = 1;i < arr.length;i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }

         //f. Randomly generate an index and display the element of this index in the array.
        int random = (int)(Math.random() * arr.length);
        System.out.println(arr[random]);

        //g. Use an array initializer to create another array with the initial values 3.5, 5.5,4.52, and 5.6.
        double[] arr2 = {3.5,5.5,4.52,5.6};
    }
}
