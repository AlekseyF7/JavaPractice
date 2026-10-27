package practice3;

public class Task2 {
    public static void main(String[] args) {
        int[] A = {1, 1, 2, 3, 3, 3, 5, 5};

        int count = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1]) {
                count++;
            }
        }

        System.out.println("Количество различных элементов: " + count);
    }
}
