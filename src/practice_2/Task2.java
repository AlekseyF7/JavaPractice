package practice_2;

import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите X: ");
        double x = scanner.nextDouble();

        System.out.print("Введите N: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Ошибка: N должно быть больше 0");
            return;
        }

        double sum = 0;
        double term = x;

        for (int k = 0; k <= n; k++) {
            sum += term;
            term = -term * x * x / ((2.0 * k + 2) * (2.0 * k + 3));
        }

        System.out.println("Результат: " + sum);
        System.out.println("Math.sin(X): " + Math.sin(x));
    }
}
