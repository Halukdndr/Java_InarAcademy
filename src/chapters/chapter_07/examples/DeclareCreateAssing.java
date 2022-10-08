package chapters.chapter_07.examples;

public class DeclareCreateAssing {
    public static void main(String[] args) {

        double[] myList;  //Declaring an array

        myList = new double[10]; // Creating an array

        myList[0] = 5.6;      // Assigning the array
        myList[1] = 4.5;
        myList[2] = 3.3;
        myList[3] = 13.2;
        myList[4] = 4.0;
        myList[5] = 34.33;
        myList[6] = 34.0;
        myList[7] = 45.45;
        myList[8] = 99.993;
        myList[9] = 11123;

        double[] myList1 = {1.2, 4.2, 5, 7.4, 5.7};  //Declaring , creating and assigning


        java.util.Scanner input = new java.util.Scanner(System.in);  // assing with for loop
        double[] myList2 = new double[10];
        for (int i = 0; i < myList2.length; i++) {
            myList2[i] = input.nextDouble();
        }

        for (int i = 0; i < myList2.length; i++){ // Print with for loop
            System.out.print(myList2[i] + " ");
    }
        System.out.println();
        for (double e: myList2){           // Print with foreach loop
            System.out.print(e + " ");
        }
    }
}