package chapters.chapter_07.checkpoints;

import java.util.Arrays;

public class CheckPoint_25 {
    public static void main(String[] args) {
        double[] list = {1, 2.5,2,9.3,5,4,7.8,10,8,5.2,0.5,4};
        System.out.println(Arrays.toString(list));
        System.out.println(Arrays.toString(descendingSelectionSort(list)));
    }
    public static double[] descendingSelectionSort(double[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            for (int j = i + 1;j < arr.length;j++){
                if (arr[i] < arr[j]){
                    swap(arr,i,j);
                }
            }
        }
        return arr;
    }
    public static void swap(double[] arr,int a,int b){
        double temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
