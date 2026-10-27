package practice_2;

import java.util.Scanner;
public class Task5 {

    // Главное меню
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== ГЛАВНОЕ МЕНЮ ===");
            System.out.println("1. Выполнить расчет");
            System.out.println("2. Информация о программе");
            System.out.println("3. Информация о разработчике");
            System.out.println("0. Выход");
            System.out.print("Выберите пункт: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    calculate(scanner);
                    break;
                case "2":
                    showProgramInfo();
                    break;
                case "3":
                    showDeveloperInfo();
                    break;
                case "0":
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ошибка: выберите пункт от 0 до 3.");
            }
        }
    }

    // Ввод, проверка и расчет
    public static void calculate(Scanner scanner) {
        while (true) {
            System.out.print("Введите радиус (или q для выхода в меню): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                return;
            }

            try {
                double radius = Double.parseDouble(input);

                if (radius <= 0 || !Double.isFinite(radius)) {
                    System.out.println("Ошибка: введите положительное конечное число.");
                    continue;
                }

                double area = Math.PI * radius * radius;

                if (!Double.isFinite(area)) {
                    System.out.println("Ошибка: радиус слишком большой.");
                    continue;
                }

                System.out.printf("Площадь круга: %.2f%n", area);
                return;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: необходимо ввести число.");
            }
        }
    }

    // Информация о программе
    public static void showProgramInfo() {
        System.out.println("\nПрограмма вычисляет площадь круга.");
        System.out.println("Формула: S = PI * r^2");
        System.out.println("Радиус должен быть больше нуля.");
    }

    // Информация о разработчике
    public static void showDeveloperInfo() {
        System.out.println("\nРазработчик: Фадеев Алексей");
        System.out.println("УрФУ, ИРИТ-РТФ");
        System.out.println("Направление: Прикладной ИИ");
    }
}
