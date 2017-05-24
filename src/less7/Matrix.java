package less7;

public class Matrix {
    private double[][] matrix;
    private int line;
    private int column;

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public Matrix(int line, int column) {
        matrix = new double[line][column];
        this.line = line;
        this.column = column;
    }

    public void fillMatrix() {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = Math.random();
            }
        }
    }

    public void sum(Matrix matrix) {
        if (this.column == matrix.getColumn() && this.line == matrix.getLine()) {
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {

                    this.matrix[i][j] = this.matrix[i][j] + matrix.matrix[i][j];
                }
            }
            matrix.print();
        } else {
            System.out.println("Матрицы не равны");
        }

    }

    public void multi(int x) {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++)
                this.matrix[i][j] = this.matrix[i][j] * x;
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
