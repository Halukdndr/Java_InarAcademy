package chapters.chapter_12.examples;

public class TestException {
    public static void main(String[] args) {
        try{
            System.out.println(sum(new  int[] {1,2,3,4,5}));
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("\n" + ex.getMessage());
            System.out.println("\n" + ex.toString());

            System.out.println("\nTrace Info Obtained from getStackTrace");
            StackTraceElement[] traceElements = ex.getStackTrace();
            for (int i = 0; i < traceElements.length; i++) {
                System.out.println("method " + traceElements[i].getMethodName());
                System.out.println("(" + traceElements[i].getClassName() + ":");
                System.out.println(traceElements[i].getLineNumber() + ")");
            }
        }
    }
    public static int sum(int[] list){
        int sum = 0;
        for (int i = 0; i <= list.length; i++) {
            sum += list[i];
        }
        return sum;
    }
}
