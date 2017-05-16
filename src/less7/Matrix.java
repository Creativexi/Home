package less7;

import java.util.Arrays;

public class Matrix {
    private double matrix[][] = {
            {0.1, 2.2},
            {1.1, 2.1}};
    private int line;
    private int column;

    double[][] sum(double[][] array1, double[][] array2) {
        double sum[][] = new double[2][2];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++)
                sum[i][j] = array1[i][j] + array2[i][j];
        }
        return sum;
    }

    private double[][] multi(double[][] array1, int x) {
        double arrmulti[][] = new double[2][2];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++)
                arrmulti[i][j] = array1[i][j] * x;
        }
        return arrmulti;
    }

    void print() {
        System.out.println(Arrays.deepToString(matrix));

    }

    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        matrix1.print();
        matrix2.print();
    }
}
