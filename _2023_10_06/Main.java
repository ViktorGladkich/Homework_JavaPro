package _2023_10_06;

public class Main {
    public static void main(String[] args) {
        // Вызов метода для получения случайного анекдота
        String randomJoke = JokeSupplier.randomJoke.get();
        System.out.println("Случайный анекдот: " + randomJoke);

        // Вызов методов для вывода четных и нечетных чисел
        System.out.println("Четные числа:");
        NumberConsumer.printEvenOddNumbers.accept(12);
        NumberConsumer.printEvenOddNumbers.accept(6);
        NumberConsumer.printEvenOddNumbers.accept(30);
        System.out.println("Нечетные числа:");
        NumberConsumer.printEvenOddNumbers.accept(7);
        NumberConsumer.printEvenOddNumbers.accept(13);
        NumberConsumer.printEvenOddNumbers.accept(19);


        // Вызов методов для проверки цвета обезьянки
        System.out.println("Цвет обезьянки: " + MonkeyPredicate.isYellowMonkey.test("yellow"));
        System.out.println("Цвет обезьянки: " + MonkeyPredicate.isYellowMonkey.test("brown"));

        // Вызов методов для преобразования чисел в градусы Цельсия
        System.out.println("Температура: " + TemperaturaConvert.convertToCelsius.apply(-150));
        System.out.println("Температура: " + TemperaturaConvert.convertToCelsius.apply(150));
    }
}
