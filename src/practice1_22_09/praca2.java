package practice1_22_09;

import java.util.Scanner;
public class praca2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите x: ");
        int x = scanner.nextInt();

        double y = 3 * Math.pow(x, 6) - 6 * Math.pow(x, 2) - 5;

        System.out.println(y);
    }
}