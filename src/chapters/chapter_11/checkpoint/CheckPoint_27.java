package chapters.chapter_11.checkpoint;

public class CheckPoint_27 {
    public static void main(String[] args) {
        Object fruit = new Fruit();
        Object apple = (Apple)fruit;
        /*
fruit is the super class of apple to casting
to object class need to casting object
  Causes a runtime ClassCastingException
 */

        }
}

          class Apple extends Fruit {
 }

       class Fruit {
}


