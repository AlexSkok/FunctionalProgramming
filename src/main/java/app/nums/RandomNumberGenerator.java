package app.nums;


public class RandomNumberGenerator {
    public static int generateRandomNumber(int min, int max){
        System.out.println("\nРандомне число в діапазоні від " + min + " до " + max);
        int res;
        max -= min;
        res = (int)(Math.random() * ++max) + min;
        System.out.println("Result: " + res);
        return res;
    };
}
