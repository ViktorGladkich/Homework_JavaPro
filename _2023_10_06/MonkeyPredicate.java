package _2023_10_06;

import java.util.function.Predicate;

public class MonkeyPredicate {
    public static Predicate<String> isYellowMonkey = color -> "yellow".equalsIgnoreCase(color);
}
