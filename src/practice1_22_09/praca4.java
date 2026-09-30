package practice1_22_09;

import java.util.Scanner;

public class praca4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Описание программы
        System.out.println("Программа рассчитывает площадь круга.");

        // 2. Ввод данных
        System.out.print("Введите радиус круга: ");
        double radius = scanner.nextDouble();

        // 3. Валидация
        if (radius <= 0) {
            System.out.println("Ошибка: радиус должен быть больше нуля.");
            return;
        }

        // 4. Расчет
        double area = Math.PI * Math.pow(radius, 2);

        // 5. Вывод результата
        System.out.printf("Площадь круга: %.2f", area);
    }
}
