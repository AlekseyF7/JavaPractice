package practice_2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите А: ");
        int A = scanner.nextInt();

        System.out.print("Введите В: ");
        int B = scanner.nextInt();

        if (A >= B) {
            System.out.println("Ошибка: А должно быть меньше В");
            return;
        }

        for (int i = A; i <= B; i++) {
            System.out.print(i + " ");
        }

        int count = B - A + 1;
        System.out.println("\nКоличество чисел: " + count);
    }
}
