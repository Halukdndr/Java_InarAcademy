package weeks.week_11;

public class JavasInCV {
    public static void main(String[] args) {
        String cv = "inar java aca java inar instroctor tariq india java haluk stackoverflow ";
        String[] arr = cv.split("java");
        int countJava = arr.length - 1;
        System.out.println(countJava);
    }
}
