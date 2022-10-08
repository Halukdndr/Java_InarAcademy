package chapters.chapter_07.checkpoints;

public class CheckPoint_10 {
    public static void main(String[] args) {
        double[] r;
        r = new double[100];
        for (int i = 0;i < r.length;i++){
            r[i] = Math.random() * 100;
        }
        int count = 0;
        for (double e: r ){
            count++;
            if (count % 10 == 0) {
                System.out.printf("%-6.2f\n",e);
            }else{
                System.out.printf("%-6.2f",e);
            }
        }
    }
}
