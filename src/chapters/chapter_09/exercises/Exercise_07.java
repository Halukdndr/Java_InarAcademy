package chapters.chapter_09.exercises;

public class Exercise_07 {
    public static void main(String[] args) {
        Account myAccount = new Account(1122,20000);
        myAccount.setAnnualInterestRate(4.5);
        myAccount.withdraw(2.500);
        myAccount.deposit(3000);
        System.out.println("The balance is " + myAccount.getBalance());
        System.out.println("The monthly interest is " + myAccount.getMonthlyInterest());
        System.out.println("The date of account creation is " + myAccount.getDateCreated());
    }
}
