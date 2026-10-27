package practice_2;

import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите epsilon: ");
        double eps = scanner.nextDouble();

        if (eps <= 0) {
            System.out.println("Ошибка: epsilon должно быть больше 0");
            return;
        }

        double a1 = 1;
        double a2 = 2;
        int k = 2;

        while (Math.abs(a2 - a1) >= eps) {
            double next = (a1 + 2 * a2) / 3;

            a1 = a2;
            a2 = next;
            k++;
        }

        System.out.println("K = " + k);
        System.out.println("A(K-1) = " + a1);
        System.out.println("A(K) = " + a2);
    }
}
