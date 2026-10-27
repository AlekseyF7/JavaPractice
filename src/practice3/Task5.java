package practice3;

import java.util.Scanner;
public class Task5 {

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
                    double[] data = new double[2];

                    if (inputData(scanner, data)) {
                        calculate(data);
                        printResult(data);
                    }
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

    // Ввод данных
    public static boolean inputData(Scanner scanner, double[] data) {
        while (true) {
            System.out.print("Введите радиус (q - возврат в меню): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                return false;
            }

            try {
                double radius = Double.parseDouble(input);

                if (!validate(radius)) {
                    System.out.println("Ошибка: некорректный радиус.");
                    continue;
                }

                data[0] = radius;
                return true;

            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите число.");
            }
        }
    }

    // Проверка данных
    public static boolean validate(double radius) {
        return radius > 0
                && Double.isFinite(radius)
                && Double.isFinite(Math.PI * radius * radius);
    }

    // Вычисление площади
    public static void calculate(double[] data) {
        data[1] = Math.PI * data[0] * data[0];
    }

    // Вывод результата
    public static void printResult(double[] data) {
        System.out.printf("Радиус: %.2f%n", data[0]);
        System.out.printf("Площадь круга: %.2f%n", data[1]);
    }

    // Информация о программе
    public static void showProgramInfo() {
        System.out.println("\nПрограмма вычисляет площадь круга.");
        System.out.println("Формула: S = PI * r^2");
        System.out.println("Для хранения данных используется массив.");
    }

    // Информация о разработчике
    public static void showDeveloperInfo() {
        System.out.println("\nРазработчик: Фадеев Алексей");
        System.out.println("УрФУ, ИРИТ-РТФ");
        System.out.println("Направление: Прикладной ИИ");
    }
}

