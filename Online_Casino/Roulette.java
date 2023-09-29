package org.example.Online_Casino;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;
import java.util.Scanner;
@AllArgsConstructor
@Getter
@Setter
public class Roulette {
    private int playerMoney;
    private int totalWins;
    private int totalLosses;
    private Scanner scanner;
    private Random random;

    public Roulette(int initialBbalance) {
        this.playerMoney = initialBbalance;
        this.totalWins = 0;
        this.totalLosses = 0;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }
    public void play() {
        System.out.println("Добро пожаловать в рулетку!");
        while (true) {
            System.out.println("Ваш баланс: " + playerMoney + " €");
            System.out.println("Ваши выигрыши: " + totalWins + " €");
            System.out.println("Ваши проигрыши: " + totalLosses + " €");

            System.out.println("Выберите Номер (0-36): ");
            int number = scanner.nextInt();

            if (number < 0 || number > 36 ) {
                System.out.println("Некорректный Номер! Попробуйте снова ");
                continue;
            }

            System.out.println("Выберите ставку (1-" + playerMoney + " €): ");
            int bet = scanner.nextInt();

            if (bet <= 0 || bet > playerMoney) {
                System.out.println("Некорректная ставка. Попробуйте снова");
                continue;
            }

            int result = random.nextInt(37);
            System.out.println("Выпавшее число: " + result);

            if (result == number) {
                System.out.println("Поздравляем! Вы выиграли " + (bet * 36) + " €");
                playerMoney += bet * 36;
                totalWins += bet * 36;
            } else {
                System.out.println("Вы проиграли " + bet + " €");
                playerMoney -= bet;
                totalLosses += bet;
            }

            System.out.println("Продолжить игру в рулетку? (1 - да, 2 - нет): ");
            int continueSelection = scanner.nextInt();
            if (continueSelection != 1) {
                break;
            }
        }
    }
}

