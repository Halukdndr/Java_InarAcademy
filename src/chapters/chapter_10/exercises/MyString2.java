package chapters.chapter_10.exercises;

public class MyString2 {
    private char[] chars;

    public MyString2(String s){
        for (int i = 0; i < s.length(); i++) {
            this.chars = s.toCharArray();
        }
    }

    public MyString2(char[] chars) {
        this.chars = chars;
    }

    public int compare(String s){
        int countS = 0;
        int countS1 = 0;

        while (countS1 < chars.length && countS < s.length()) {
            if (chars[countS1] != s.charAt(countS)) {
                return  chars[countS1] - s.charAt(countS);
            }
            countS1++;
            countS++;
        }
        if (countS1 == chars.length && countS == s.length()) {
            return 0;
        } else if (countS1 == chars.length) {
            return -1;
        } else {
            return 1;
        }

    }
    public MyString2 substring(int begin){
        char[] arr = new char[chars.length - begin];
        for (int i = begin,j = 0; i < chars.length; i++,j++) {
            arr[j] = chars[i];
        }
        return new MyString2(arr);
    }
    public MyString2 toUpperCase(){
        for (int i = 0; i < chars.length; i++) {
            if (96 < (int)chars[i] && (int)chars[i] < 123){
                chars[i] = (char)((int)chars[i] - 32);
            }
        }
        return new MyString2(chars);
    }
    public char[] toChars(){
        return chars;
    }
    public static MyString2 valueOf(boolean b){
        String s = b  + "";
        return new MyString2(s);
    }
    public String toString(){
        String s = "";
        for (int i = 0; i < chars.length; i++) {
            s += chars[i];
        }
        return s;
    }
}
