
package less13;

import less11.Clothes.ManClothes;

import java.util.Arrays;

public class Matrix2<T extends Number> {
    private T[][] matrix;
    private int line;
    private int column;

    public int getLine() {
        return line;
    }

    public int getColumn() {
        return column;
    }

    public Matrix2(T[][] matrix) {
        this.matrix = matrix;
        this.line = line;
        this.column = column;
    }

    public Matrix2 sum(Matrix2 matrix2) {
        Double[][] m = new Double[0][];
        if (this.column == matrix2.getColumn() && this.line == matrix2.getLine()) {
            m = new Double[line][column];
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++) {

                    m[i][j] = matrix[i][j].doubleValue() + matrix2.getMatrix()[i][j].doubleValue();
                }
            }
            matrix2.print();
        } else {
            System.out.println("Матрицы не равны");
        }
        return new Matrix2(m);
    }

    public Matrix2 multi(Matrix2 matrix2) {
        Double[][] m = new Double[0][];
        if (this.column == matrix2.getColumn() && this.line == matrix2.getLine()) {
            m = new Double[line][matrix2.getColumn()];
            for (int i = 0; i < line; i++) {
                for (int j = 0; j < column; j++)
                    m[i][j] += matrix[i][j].doubleValue() * matrix2.getMatrix()[i][j].doubleValue();
            }

        }
        return new Matrix2(m);
    }

    public void print() {
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(this.matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public T[][] getMatrix() {
        return matrix;
    }

   /* @Override
    public String toString() {
        return "Matrix{" +
                "matrix=" + Arrays.toString(matrix) +
                ", line=" + line +
                ", column=" + column +
                '}';
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Matrix2 matrix1 = (Matrix2) o;

        if (line != matrix1.line) return false;
        if (column != matrix1.column) return false;
        return Arrays.deepEquals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        int result = Arrays.deepHashCode(matrix);
        result = 31 * result + line;
        result = 31 * result + column;
        return result;
    }
}

