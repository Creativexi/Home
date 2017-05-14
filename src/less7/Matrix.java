package less7;

import java.util.Arrays;

public class Matrix {
    private static double matrix[][] = {
            {0.1, 2.2},
            {1.1, 2.1}};
    private int line;
    private int column;

    public static double[][] sum(double[][] array1, double[][] array2) {
        double sum[][] = new double[2][2];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++)
                sum[i][j] = array1[i][j] + array2[i][j];
        }
        return sum;
    }

    public static double[][] multi(double[][] array1, int x) {
        double arrmulti[][] = new double[2][2];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++)
                arrmulti[i][j] = array1[i][j] * x;
        }
        return arrmulti;
    }

    public static void print(double array[][]) {
        System.out.println(Arrays.deepToString(array));

    }

    public static void main(String[] args) {
        double arr[][] = {
                {1.2, 1.5},
                {1.2, 1.2}};
        print(matrix);
        print(arr);
        print(sum(arr, matrix));
        print(multi(arr, 100));
    }
}
