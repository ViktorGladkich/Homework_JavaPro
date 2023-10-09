package _2023_10_06;

import java.util.function.Function;

public class TemperaturaConvert {
    public static Function<Integer, String> convertToCelsius = value -> {
        value = Math.min(100, Math.max(-100, value));
        String sign = value >= 0 ? "+" : "-";
        int absValue = Math.abs(value);
        return sign + absValue + " degrees Celsius";
    };
}
