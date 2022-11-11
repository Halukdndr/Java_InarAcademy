package chapters.chapter_09.exercises;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;



    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getDiscriminant(){
        return Math.pow(this.b,2) - 4 * this.a * this.c;
    }
    public double getRoot1(){
        if (this.getDiscriminant() >= 0){
            return (Math.sqrt(this.b * this.b - 4 * this.a * this.c) - this.b) / (2 * a);
        }else{
            return 0;
        }
    }
    public double getRoot2(){
        if (this.getDiscriminant() > 0){
            return  (Math.sqrt(this.b * this.b - 4 * this.a * this.c) + this.b) / (-2 * a);
        }else {
            return 0;
        }
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }
}
