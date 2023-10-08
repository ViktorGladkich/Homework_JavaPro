package _2023_09_29;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Monkey> monkeys = new ArrayList<>();

        monkeys.add(new Monkey("Charli", 10, "Black", true, 9.0));
        monkeys.add(new Monkey("Bella", 5, "Grey", false, 11.0));
        monkeys.add(new Monkey("Archi", 3, "Black", true, 7.0));
        monkeys.add(new Monkey("King", 13, "Brown", false, 15.0));

        // Получить имя и информацию, голодная ли обезьяна
        Map<String, Boolean> nameMapIsHungry = new HashMap<>();
        for (Monkey monkey : monkeys) {
            nameMapIsHungry.put(monkey.getName(), monkey.isHungry());
        }
        System.out.println("Имя и информация, голодна ли обезьяна:");
        for (Map.Entry<String, Boolean> entry : nameMapIsHungry.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Получить цвет и список имен обезьян данного цвета
        Map<String, List<String>> colorMapNames = new HashMap<>();
        for (Monkey monkey : monkeys) {
            String color = monkey.getColour();
            colorMapNames.computeIfAbsent(color, k -> new ArrayList<>()).add(monkey.getName());
        }
        System.out.println("\nЦвет и список имен обезьян данного цвета:");
        for (Map.Entry<String, List<String>> entry : colorMapNames.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // Получить цвет и количество обезьян данного цвета
        Map<String, Integer> colorCountMap = new HashMap<>();
        for (Monkey monkey : monkeys) {
            String color = monkey.getColour();
            colorCountMap.put(color, colorCountMap.getOrDefault(color, 0) + 1);
        }
        System.out.println("\nЦвет и количество обезьян данного цвета:");
        for (Map.Entry<String, Integer> entry : colorCountMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // отсортировать исходный список по весу и имени
        Comparator<Monkey> comparator = Comparator.comparing(Monkey::getWeight).thenComparing(Monkey::getName);
        System.out.println("\nОтсортированный список обезьян:");
        for (Monkey monkey : monkeys) {
            System.out.println(monkey.getName() + " - Вес: " + monkey.getWeight());
        }
    }
}

