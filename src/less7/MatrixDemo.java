package less7;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix matrix2 = new Matrix(2, 2);
        matrix1.fillMatrix();
        matrix2.fillMatrix();

        System.out.println("matrix1:");
        matrix1.print();
        System.out.println("matrix2");
        matrix2.print();
        System.out.println("sum");
        matrix1.sum(matrix2);
        matrix1.print();
        System.out.println("multiply");
        matrix1.multi(4);
        matrix1.print();
    }
}
