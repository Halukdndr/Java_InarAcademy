package weeks.week_09;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        fillTheArrayRandomly(array,0,99);
        ascendingSelectionSort(array);
        printArray(array);
        System.out.println("Please enter the number you want to find");
        int num = input.nextInt();
        int index = getTheIndexWithBinarySearch(array,num);
        System.out.printf("The number %d is in index [%d]",num,index);

    }

    public static int getTheIndexWithBinarySearch(int[] arr,int num) {
        int start = 0;
        int end = arr.length;

        while (start <= end){
            int mid = (start + end) / 2;
            if (arr[mid] > num){
                end = mid - 1;
            } else if (arr[mid] < num) {
                start = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void ascendingSelectionSort(int[] arr) {
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = i + 1;j < arr.length;j++){
                if(arr[i] > arr[j]){
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void swap(int [] arr,int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int[] arr) {
        for (int e: arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void fillTheArrayRandomly(int[] arr,int start,int end) {
        for (int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random() * (end - start + 1) + start);
        }
    }
}
