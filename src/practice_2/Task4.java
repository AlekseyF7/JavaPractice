package practice_2;

import java.util.Scanner;
public class Task4 {
    public static void printInterval(double a, double b) {
        if (a == b) {
            System.out.println("Ошибка: числа должны быть различными");
            return;
        }

        double min = Math.min(a, b);
        double max = Math.max(a, b);

        long c = (long) Math.ceil(max);
        long d = (long) Math.floor(min);

        System.out.println("Числа по возрастанию: " + min + ", " + max);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        System.out.println(c + " >= " + max + " > " + min + " >= " + d);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        printInterval(a, b);
    }
}
