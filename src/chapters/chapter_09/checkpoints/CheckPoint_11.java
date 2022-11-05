package chapters.chapter_09.checkpoints;

public class CheckPoint_11 {
    /*a)
        /* public class ShowErrors {
              public static void main(String[] args) {
                ShowErrors t = new ShowErrors(5);
              }
            }
        ShowErrors class don't have a constructor with an argument
        */
    /*b)
        /* public class ShowErrors {
            public static void main(String[] args) {
                ShowErrors t = new ShowErrors();
                t.x();
            }
        }
        ShowErrors class don't have a x() method.
     */

    /*c)
        public class ShowErrors {
            public void method1() {
                Circle c;
                System.out.println("What is radius " + c.getRadius());
                c = new Circle();
            }
        }
        it throws  NullPointerException
     */

    /*d)
        public class ShowErrors {
            public static void main(String[] args) {
                C c = new C(5.0);
                System.out.println(c.value);
            }
        }

         class C {
            int value = 2;
         }
         cant pass a double argument to constructor
     */
}


