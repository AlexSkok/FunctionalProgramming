package app.string;

public class StringListProcessor {
    public static int countUppercase(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))){
                counter++;
            }
        }
        System.out.println(counter);
        return counter;
    }
}
