package chapters.chapter_06.examples;


public class TestMethodOverloading {
    public static void main(String[] args) {


        System.out.println("The max value is " + max(5,7));
        System.out.println("The max value is " + max(5.2,7.7));
        System.out.println("The max value is " + max(3,1,9));
        System.out.println("The maximum of 3.0, 5.4, and 10.14 is " + max(3.0,5.4,10.14));

    }

    public static int max(int n1,int n2) {
        int max = 0;
        if (n1 > n2){
           max = n1;
        }else {
            max = n2;
        }
        return max;
    }

    public static double max(double n1,double n2){
        double max = 0;
        if (n1 > n2){
            max = n1;
        }else{
            max = n2;
        }
        return max;
    }
    public static double max(double n1,double n2,double n3){
       return max(max(n1,n2),n3);
    }

}
