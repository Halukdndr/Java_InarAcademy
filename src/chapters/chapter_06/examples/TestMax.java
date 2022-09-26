package chapters.chapter_06.examples;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

public class TestMax {
    public static void main(String[] args) {
        System.out.println(max(3,4));
        System.out.println(max(-5,3));
        System.out.println(max(6,6));
    }
    public static int max(int num1,int num2){
        int max = 0;
        if ( num1 >= num2){
            max = num1;
        }else {
            max = num2;
        }
        return max;
    }
}
