package less7;

public class Matrix {
    private double[][] matrix;
    private int line;
    private int column;

    public Matrix(int line, int column) {
        matrix = new double[line][column];
        this.line = line;
        this.column = column;
    }

    public void setElement(int line, int column, double value) {
        matrix[line][column] = value;
    }

    public void fillMatrix() {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                this.setElement(i, j, Math.random());
            }
        }
    }

    public double matrixGetElement(int line, int column) {
        return matrix[line][column];
    }

    public void sum(Matrix matrix) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                this.matrix[i][j] = this.matrix[i][j] + matrix.matrix[i][j];
        }
    }

    public void multi(int x) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                this.setElement(i, j, this.matrixGetElement(i, j) * x);
        }
    }

    public void print() {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
