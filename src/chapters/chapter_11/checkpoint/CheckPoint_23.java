package chapters.chapter_11.checkpoint;

public class CheckPoint_23 {
    public static void main(String[] args) {
        new Z();
        new H();
    }
}
class Z {
    int i = 7;
    public Z() {
        setI(20);
        System.out.println("i from Z is " + i);
    }
    public void setI(int i) {
        this.i = 2 * i;
    }
}
class H extends Z {
    public H() {
        System.out.println("i from H is " + i);
    }
    public void setI(int i) {
        this.i = 3 * i;
    }
}

