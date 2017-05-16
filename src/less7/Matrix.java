package less7;

public class Matrix {
    private double matrix[][] = {
            {0.1, 2.2},
            {1.1, 2.1}};
    private int line;
    private int column;

    private int getRowsQuantity() {
        return matrix.length;
    }
    private int getColumnsQuantity() {
        return matrix[0].length;
    }
    void setMatrix() {
        this.matrix = matrix;
    }
    public double[][] getMatrix() {
        return matrix;
    }
    double[][] sum(double[][] array1, double[][] array2) {
        double sum[][] = new double[2][2];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++)
                sum[i][j] = array1[i][j] + array2[i][j];
        }
        return sum;
    }
    double[][] multi(int x) {
        double[][] m = new Matrix().getMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++)
                m[i][j] = matrix[i][j] * x;
        }
        return m;
    }
    public void print(double[][] matrix) {
        for (int i = 0; i < this.getRowsQuantity(); i++) {
            for (int j = 0; j < this.getColumnsQuantity(); j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix();
        Matrix matrix2 = new Matrix();
        Matrix arrsum = new Matrix();
        System.out.println("matrix1:");
        matrix1.print(matrix1.getMatrix());
        System.out.println("matrix2");
        matrix2.print(matrix2.getMatrix());
        System.out.println("matrix * 4:");
        matrix1.print(matrix1.multi(4));
        System.out.println("matrix1 + matrix2:");
        arrsum.print(arrsum.sum(matrix1.getMatrix(), matrix2.getMatrix()));
    }
}
