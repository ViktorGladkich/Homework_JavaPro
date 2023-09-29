package org.example.Online_Casino;


import java.util.Scanner;

public class Online_Casino {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в казино!");
        int initialBbalance = 2500;
        Scanner scanner = new Scanner(System.in);

        Roulette roulette = new Roulette(initialBbalance);
        Game777 game777 = new Game777(initialBbalance);

        while (initialBbalance > 0) {
            System.out.println("Выберите игру:");
            System.out.println("1. Рулетка");
            System.out.println("2. Игровой автомат 777");
            System.out.println("3. Выйти из казино");

            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    roulette.play();
                    break;
                case 2:
                    game777.play();
                    break;
                case 3:
                    System.out.println("Спасибо за игру!");
                    return;
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }

        System.out.println("У вас закончились деньги. Игра окончена.");
    }
}

