package less7;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(2, 2);
        Matrix  matrix2 = new Matrix(2, 2);
        matrix1.fillMatrix();
        matrix2.fillMatrix();

        System.out.println("matrix1:");
       // matrix1.print(matrix1);
        System.out.println("matrix2");
        //matrix2.print(matrix2);
        System.out.println("sum");
        matrix1 = matrix1.sum(matrix2);
        //matrix1.print(matrix1);
        System.out.println("multiply");
    //    matrix1.print(matrix1.multi(matrix1, 5));
    }
}
