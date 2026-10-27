package practice3;

import java.util.Arrays;
public class Task3 {

    public static double[] calculateB(int[] A) {
        int n = A.length;
        double[] B = new double[n];

        double sum = 0;

        for (int i = n - 1; i >= 0; i--) {
            sum += A[i];
            B[i] = sum / (n - i);
        }

        return B;
    }

    public static void main(String[] args) {
        int[] A = {2, 4, 6, 8};

        double[] B = calculateB(A);

        System.out.println("Массив A: " + Arrays.toString(A));
        System.out.println("Массив B: " + Arrays.toString(B));
    }
}
