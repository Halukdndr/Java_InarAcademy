package weeks.week_15;

public class Samet {

    public static void main(String[] args) {
        String s = "I java and inar and tarik";
        System.out.println(getTheIndexOfTheFirstNonDublicatedVove(s));
    }
    public static int getTheIndexOfTheFirstNonDublicatedVove(String s){
        boolean isNondublicated = true;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                for (int j = 0; j < s.length(); j++) {
                    if (i == j){
                        continue;
                    }else if (ch == s.charAt(j)){
                        isNondublicated = false;
                        break;
                    }
                }
                if (isNondublicated){
                    return i;
                }
            }else {
                continue;
            }
        }
        return -1;

    }

}
