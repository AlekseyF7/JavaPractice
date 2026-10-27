package practice3;

public class Task4 {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        for (int i = 0; i < A.length; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.print(A[i][j] + " ");
                }
            } else {
                for (int j = A[i].length - 1; j >= 0; j--) {
                    System.out.print(A[i][j] + " ");
                }
            }

            System.out.println();
        }
    }
}

