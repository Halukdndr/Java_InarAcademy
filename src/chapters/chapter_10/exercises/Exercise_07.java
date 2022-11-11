package chapters.chapter_10.exercises;

import chapters.chapter_09.exercises.Account;
import java.util.Scanner;

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Account[] arr = new Account[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Account(i,100);
        }
        while (true) {
            System.out.println("Enter an id: ");
            int id = input.nextInt();
            while (id < 0 || id > 9){
                System.out.println("Enter a correct id: ");
                id = input.nextInt();
            }
            accountStuffs(arr, id, input);
        }

    }

    private static void accountStuffs(Account[] arr,int id,Scanner input) {
        int choice = 0;
        while (choice != 4){
            displayMainMenu();
                System.out.println("Enter a choice");
                choice = input.nextInt();
                while (choice < 1 || choice > 4){
                    System.out.println("Enter a correct choice: ");
                    choice = input.nextInt();
                }
            switch (choice){
                case 1: System.out.println("The balance is " + arr[id].getBalance());break;
                case 2:
                    System.out.println("Enter an amount to withdraw: ");
                    double withdrawAmount = input.nextDouble();
                    arr[id].withdraw(withdrawAmount);break;
                case 3:
                    System.out.println("Enter an amount to deposit: ");
                    double depositAmount = input.nextDouble();
                    arr[id].deposit(depositAmount);break;
            }
            System.out.println();
        }
    }

    public static void displayMainMenu(){
        System.out.println("Main menu");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
    }

}
