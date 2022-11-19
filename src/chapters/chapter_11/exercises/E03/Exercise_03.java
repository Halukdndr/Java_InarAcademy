package chapters.chapter_11.exercises.E03;
import chapters.chapter_09.exercises.Account;

public class Exercise_03 {
    public static void main(String[] args) {
        Account a = new Account(514, 800);
        CheckingAccount c = new CheckingAccount(356, 872.20, 100);
        SavingsAccount s = new SavingsAccount(543, 300);

        System.out.println(a);
        System.out.println(c);
        c.withdraw(1000);
        System.out.println(s);
        s.withdraw(290);
        System.out.println(s.getBalance());
    }
}
