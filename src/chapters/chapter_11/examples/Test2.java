package chapters.chapter_11.examples;

public class Test2 {
    public static void main(String[] args) {
       K a = new K();
        a.p(10);
        a.p(10.0);
    }
}
class D {
    public void p(double i) {
        System.out.println(i * 2);
    }
}
class K extends D {
    // This method overloads the method in B
    public void p(int i) {   // 10
        System.out.println(i);  // 20

    }
}
