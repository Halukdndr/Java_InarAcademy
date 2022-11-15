package chapters.chapter_10.exercises;

public class MyString1 {
    private char[] chars;
    public MyString1(char[] chars){
        this.chars = chars;
    }
    public char charAt(int index){
        return chars[index];
    }
    public int length(){
        return chars.length;
    }
    public MyString1 substring(int begin, int end){
        if (begin < 0 || end > length() || begin > end) {
            System.out.println("Invalid substring parameters!");
            System.exit(1);
        }
        char[] arr = new char[end - begin];
        for (int i = begin,j = 0; i < end; i++,j++) {
            arr[j] = chars[i];
        }
        return new MyString1(arr);

    }
    public MyString1 toLowerCase(){
        for (int i = 0; i < chars.length; i++) {
            if (64 < (int)chars[i] && (int)chars[i] < 91){
                chars[i] = (char)((int)chars[i] + 32);
            }
        }
        return new MyString1(chars);
    }
    public boolean equals(MyString1 s){
        if (chars.length == s.length()) {
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] != s.charAt(i)){
                    return false;
                }
            }
        }else return false;
        return true;
    }
    public static MyString1 valueOf(int i){
       int temp = i;
       int counter = 0;
        while (i != 0){
            i /= 10;
            counter++;
        }
        char[] arr = new char[counter];
        i = temp;
        for (int k = arr.length - 1; k >= 0;k--) {
            arr[k] = (char)((i % 10) + '0');
            i /= 10;
        }
        return new MyString1(arr);
    }
    public String toString() {
        return new String(chars);
    }
}
