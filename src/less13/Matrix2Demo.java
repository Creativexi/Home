package less13;

import java.util.Random;

public class Matrix2Demo {
    public static Double[][] getDoubleArray2D() {
        return new Double[][]{
                {Math.random(), Math.random(), Math.random()},
                {Math.random(), Math.random(), Math.random()},
                {Math.random(), Math.random(), Math.random()}
        };
    }

    public static Integer[][] getIntArray2D() {
        return new Integer[][]{
                {new Random().nextInt(10), new Random().nextInt(10), new Random().nextInt(10)},
                {new Random().nextInt(10), new Random().nextInt(10), new Random().nextInt(10)},
                {new Random().nextInt(10), new Random().nextInt(10), new Random().nextInt(10)}
        };
    }

    public static void main(String[] args) {
        Matrix2<Double> a = new Matrix2<>(getDoubleArray2D());
        System.out.println("Matrix A:\n" + a);

        Matrix2<Integer> b = new Matrix2<>(getIntArray2D());
        System.out.println("Matrix B:\n" + b);

        Matrix2 c = b.sum(a);
        System.out.println("Matrix C = A + B:\n" + c);


      /*  Matrix2 d = a.multi(2);
        System.out.println("Matrix D = A * 2:\n" + d);*/

    }
}
