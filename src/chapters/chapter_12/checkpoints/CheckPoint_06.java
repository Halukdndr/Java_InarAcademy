package chapters.chapter_12.checkpoints;

public class CheckPoint_06 {
    public static void main(String[] args) {
        /*for (int i = 0; i < 2; i++) {             // 0 1
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            }

            catch (Exception ex) {
            }
        }

         */
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");         // 0
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex) {
        }
    }
}
