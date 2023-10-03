package _2023_09_27;

public class Algoritms {
    public static void main(String[] args) {
        int n = 29;
        int m = 67;
        int[][] a = new int[n][m];
        int[][] table = new int[n][n];
        int count = 0;

        // A!
        // Временная сложность - O(n * m), где n - количество итераций первого цикла, m - количество итераций второго цикла
        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < m; ++j) {
                a[i][j]++;
            }
        }
        System.out.println("Массив A после фрагмента A:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Переход на следующую строку для читаемости
        }


        // B!
        // Временная сложность - O(n^2), где n - количество итераций первого цикла, n - количество итераций второго цикла (внутренний цикл уменьшается с каждой итерацией внешнего цикла)
        for (int i = 0; i < n - 1; ++i) {
            for (int j = 0; j < n - i; ++j) {
                a[i][j]++;
            }
        }
        System.out.println("Массив A после фрагмента B:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Переход на следующую строку для читаемости
        }

        // C!
        // Временная сложность - O(n * log3(n)), где n - количество итераций первого цикла
        // log3(n) - количество итераций второго цикла, j умножается на 3 на каждой итерации
        for (int i = 0; i < n; ++i) {
            for (int j = 1; j < n; j *= 3) {
                a[i][j]++;
            }
        }
        System.out.println("Массив A после фрагмента C:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Переход на следующую строку для читаемости
        }

        // D!
        // Временная сложность - O(1000 * n), где 1000 - количество итераций первого цикла
        // n - количество итераций второго цикла
        for (int i = 0; i < 1000; ++i) {
            for (int j = 1; j < n; ++j) {
                ++count;
            }
        }
        System.out.println("Массив A после фрагмента D:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Переход на следующую строку для читаемости
        }

        // E!
        // Временная сложность - O(n^2/3), где n - количество итераций первого цикла
        // n/3 - количество итераций второго цикла
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n / 3; ++j) {
                table[i][i]++;
            }
        }
        System.out.println("Массив A после фрагмента E:");
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(); // Переход на следующую строку для читаемости
        }

        int factorial = Factorial.factorial(n);
        System.out.println("Факториал " + n + " равен " + factorial);
    }
}

