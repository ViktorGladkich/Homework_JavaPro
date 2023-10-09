package _2023_10_06;

import java.util.function.Consumer;

public class NumberConsumer {
    public static Consumer<Integer> printEvenOddNumbers = number -> {
        if (number % 2 == 0) {
            System.out.println(number);
        } else {
            System.err.println(number);
        }
    };
}
