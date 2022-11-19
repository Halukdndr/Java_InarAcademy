package chapters.chapter_11.checkpoint;
import java.util.ArrayList;
public class CheckPoint_31 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Austin");
      // list.add(new java.util.Date()); // list arraylist only contains String objects
        String city = list.get(0);
       // list.set(3, "Dallas"); // we can not use set method with an object which is not belong to the arraylist
        //System.out.println(list.get(3));  //IndexOutOfBoundsException
    }
}
