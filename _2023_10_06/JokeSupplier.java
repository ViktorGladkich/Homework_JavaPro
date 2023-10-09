package _2023_10_06;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class JokeSupplier {
    private static final List<String> jokes = List.of(
            "Анекдот 1",
            "Анекдот 2",
            "Анекдот 3",
            "Анекдот 4",
            "Анекдот 5"
    );

    public static Supplier<String> randomJoke = () -> {
        Random random = new Random();
        int index = random.nextInt(jokes.size());
        return jokes.get(index);
    };
}
