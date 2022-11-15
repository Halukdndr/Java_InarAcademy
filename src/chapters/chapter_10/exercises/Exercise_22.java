package chapters.chapter_10.exercises;

public class Exercise_22 {
    public static void main(String[] args) {
        char[] arr = {'a','y'};
        MyString1 myString1 = new MyString1(arr);
        System.out.println(myString1.toString());
        System.out.println(MyString1.valueOf(156).toString());
        char[] arr1 = {'a','y'};
        char[] arr2 = {'A','y','ı'};
        MyString1 myString12 = new MyString1(arr2);
        MyString1 myString11 = new MyString1(arr1);
        System.out.println(myString1.equals(myString11));
        System.out.println(myString1.equals(new MyString1(arr2)));
        System.out.println(myString12.toLowerCase().toString());
        System.out.println(myString12.substring(1,3));
        System.out.println(myString1.charAt(0) + " " + myString1.charAt(1));
        System.out.println(myString1.length());
    }
}
