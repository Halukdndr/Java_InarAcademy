package chapters.chapter_06.checkpoints;

public class CheckPoint_08 {
    public static void main(String[] args) {     //e
        message("haluk",5);
    }

    public static String message(String message,int times){ // a
        for (int i = 0; i < times; i++){
            System.out.println(message);
        }
        return message;
    }
    /*public static double salesCommission(double amaunt,double commissionRate){ //b

    }
    public static void calender(int year,int month){ //c

    }
    public static double sqrRoot(int number){  //d

    }
    public static double monthlyPayment(double loanAmount,int years,double annualInterestRate){

    }
    public static char toUppercase(char letter){

    }*/
}
