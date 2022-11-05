package chapters.chapter_09.checkpoints;

public class CheckPoint_25 {
    /* a)
    public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a[0], a[1]);
        System.out.println("a[0] = " + a[0]
                + " a[1] = " + a[1]);
    }
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }

     a[0] = 1 a[1] = 2
     */

    /*  b)
    public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a);
        System.out.println("a[0] = " + a[0] + " a[1] = " + a[1]);
    }
    public static void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
     a[0] = 2 a[1] = 1
     */
   /*  c)
    public static void main(String[] args) {
        T t = new T();
        swap(t);
        System.out.println("e1 = " + t.e1
                + " e2 = " + t.e2);
    }
    public static void swap(T t) {
        int temp = t.e1;
        t.e1 = t.e2;
        t.e2 = temp;
    }
}
class T {
    int e1 = 1;
    int e2 = 2;
}
 e1 = 2 e2 = 1
*/
/*  d)
    public static void main(String[] args) {
        System.out.println(T.i);    //0
        T t1 = new T();
        System.out.println("t1's i = " +
                t1.i + " and j = " + t1.j);  // i = 1  j = 1
        T t2 = new T();
        System.out.println("t1's i = " +
                t1.i + " and j = " + t1.j);  // i = 2 j = 1
        System.out.println("t2's i = " +
                t2.i + " and j = " + t2.j);  // i = 2 j = 1
    }
}
class T {
    static int i = 0;
    int j = 0;
    T() {
        i++;
        j = 1;
    }

 */
}