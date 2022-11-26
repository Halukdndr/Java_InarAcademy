package chapters.chapter_12.exercises.E01;

public class NumberFormatException {
    public static void main(String[] args) {

        if (args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }

        try {
            int operand1 = Integer.parseInt(args[0]);
            int operand2 = Integer.parseInt(args[2]);
            switch (args[1]){
                case "+":
                    System.out.println(operand1 + operand2);
                    break;
                case ".":
                    System.out.println(operand1 * operand2);
                    break;
                case "-":
                    System.out.println(operand1 - operand2);
                    break;
                case "/":
                    System.out.println(operand1 / operand2);
            }
        }catch (java.lang.NumberFormatException ex){
            System.out.println("Wrong input: ");
        }

    }
}
