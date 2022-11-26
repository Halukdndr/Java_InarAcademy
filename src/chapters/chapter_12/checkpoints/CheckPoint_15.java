package chapters.chapter_12.checkpoints;

public class CheckPoint_15 {
    public static void main(String[] args) {
        try {
            method();
            System.out.println("After the method call");
        }
        catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
            StackTraceElement[] stackTraceElements = ex.getStackTrace();
            for (int i = 0; i < stackTraceElements.length; i++) {
                System.out.println(stackTraceElements[i].getMethodName());
                System.out.println(stackTraceElements[i].getLineNumber());
            }
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException");
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
    }
    static void method() throws Exception { // ArithmeticException
        System.out.println(1 / 0);
    }
}
