package app;

import app.string.StringManipulator;

public class Main {
    public static void main(String[] args) {
        String text = "sdsadsadas";
        System.out.println("app start");
//        anonim class
        MathOperation funcAddition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                int result;
                result = a + b;
                return result;
            }
        };
        System.out.println(funcAddition.operate(29, 50));
//        ------------
//        2. lambda
        StringManipulator firstToUppercase = text1 -> {
            String res = text1.substring(0, 1).toUpperCase() + text1.substring(1);
            return res;
        };
        System.out.println(firstToUppercase.firstToUppercaseMethod(text));
//        ------------
    }
}