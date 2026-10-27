package practice3;

public class Task1 {
    public static void main(String[] args) {
        int[] A = {10, 20, 30, 40, 50, 60};

        int N = A.length;

        for (int i = 1; i < N; i += 2) {
            System.out.print(A[i] + " ");
        }
    }
}
