package app;

import app.nums.RandomNumberGenerator;
import app.string.StringListProcessor;
import app.string.StringManipulator;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        String text = "hello world, is homework";
        String text2 = "Text To Count UpperCase";
        String textEmpty = "";
//        ----------------
        System.out.println("app start");
//      task#2  #anonim class-----------
        MathOperation funcAddition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                System.out.println("\nАнонімний клас, інтерфейс MathOperation, додавання " + a + " + " + b);
                int result;
                result = a + b;
                return result;
            }
        };
        System.out.println("Result: " + funcAddition.operate(29, 50));
//      task#3 lambda----------
        StringManipulator firstToUppercase = text1 -> {
            System.out.println("\nПершу літера до верхнього регістру");
            String res = "";
            if (text1.isEmpty()) {
                System.out.println("is Empty");
            } else {
                res = text1.substring(0, 1).toUpperCase() + text1.substring(1);
            }
            return res;
        };
        System.out.println(firstToUppercase.firstToUppercaseMethod(text));
//      task#5 ------------
        Function<String, Integer> countUppercaseInString = StringListProcessor::countUppercase;
        countUppercaseInString.apply(text2);
//      task#7  ------------
        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return RandomNumberGenerator.generateRandomNumber(1, 100);
            }
        };
        supplier.get();
    }
}