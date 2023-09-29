package org.example.Online_Casino;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;

@AllArgsConstructor
@Getter
@Setter
public class Game777 {
    private int playerMoney;
    private int totalWins;
    private int totalLosses;
    private Scanner scanner;
    private Random random;

    public Game777(int initialBbalance) {
        this.playerMoney = initialBbalance;
        this.totalWins = 0;
        this.totalLosses = 0;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void play() {
        System.out.println("Добро пожаловать в игровой автомат 777!");
        while (true) {
            System.out.println("Ваш баланс: " + playerMoney + " €");
            System.out.println("Ваши выигрыши: " + totalWins + " €");
            System.out.println("Ваши проигрыши: " + totalLosses + " €");
            System.out.println("Выберите ставку (1-" + playerMoney + " €): ");

            int bet = scanner.nextInt();
            if (bet <= 0 || bet > playerMoney) {
                System.out.println("Некорректная ставка. Попробуйте снова.");
                continue;
            }

            int num1 = random.nextInt(10);
            int num2 = random.nextInt(10);
            int num3 = random.nextInt(10);

            System.out.println("Результат: " + num1 + " " + num2 + " " + num3);

            if (num1 == 7 && num2 == 7 && num3 == 7) {
                System.out.println("Поздравляем! Вы выиграли " + (bet * 10) + " €");
                playerMoney += bet * 10;
                totalWins += bet * 10;
            } else {
                System.out.println("Вы проиграли " + bet + " €");
                playerMoney -= bet;
                totalLosses += bet;
            }

            System.out.println("Продолжить игру в игровой автомат 777? (1 - да, 2 - нет): ");
            int continueChoice = scanner.nextInt();
            if (continueChoice != 1) {
                break;
            }
        }
    }
}

