package practice1_22_09;

public class praca3 {
    public static void main(String[] args) {
        int a = 5;
        int b = -3;
        int c = 10;

        int positive = 0;
        int negative = 0;

        if (a > 0) {
            positive++;
        } else if (a < 0) {
            negative++;
        }

        if (b > 0) {
            positive++;
        } else if (b < 0) {
            negative++;
        }

        if (c > 0) {
            positive++;
        } else if (c < 0) {
            negative++;
        }

        System.out.println("Положительных: " + positive);
        System.out.println("Отрицательных: " + negative);
    }
}