package chapters.chapter_10.exercises;

public class Exercise_23 {
    public static void main(String[] args) {
        String s = "inar";
        MyString2 myString2 = new MyString2(s);
        MyString2 myString21 = new MyString2("Anar");
        String s1 = "Anar";
        System.out.println(myString2.compare(s1));
        System.out.println(s.compareTo(s1));
        MyString2 a = myString21.substring(1);
        System.out.println(a.toString());
        System.out.println(MyString2.valueOf(false));
    }
}
