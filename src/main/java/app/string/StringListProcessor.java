package app.string;

public class StringListProcessor {
    public static int countUppercase(String s){
        System.out.println("\nКаунтер літер верхнього регістру");
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))){
                counter++;
            }
        }
        System.out.println("Великих літер " + counter);
        return counter;
    }
}
