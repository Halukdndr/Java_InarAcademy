package chapters.chapter_09.checkpoints;
import java.util.Date;
public class CheckPoint_26 {
    /* a)
    public static void main(String[] args) {

        Date date = null;
        m1(date); // changes nothing
        System.out.println(date);
    }
    public static void m1(Date date) {
        date = new Date();
    }

     */
/* b)
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);   // changes nothing
        System.out.println(date.getTime());  // 1234567
    }
    public static void m1(Date date) {
        date = new Date(7654321);
    }

 */
    /* c)
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);
        System.out.println(date.getTime());  // 7654321
    }
    public static void m1(Date date) {
        date.setTime(7654321);
    }

     */
    /* d)
    public static void main(String[] args) {
        Date date = new Date(1234567);
        m1(date);  // nothing changes
        System.out.println(date.getTime());  // 1234567
    }
    public static void m1(Date date) {
        date = null;
    }

     */
}
