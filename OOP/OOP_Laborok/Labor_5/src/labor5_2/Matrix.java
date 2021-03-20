package labor5_2;

import java.util.Random;

public class Matrix {
    private int rows;
    private int colums;
    private double[][] data;

    public Matrix(int rows, int colums){
        this.rows = rows;
        this.colums = colums;
        this.data = new double[this.rows][this.colums];
    }

    public void fillRandom(double a, double b){
        Random random = new Random();
        for(int i=0; i<this.rows; ++i){
            for (int j=0; j<this.colums; ++j){
                this.data[i][j] = random.nextDouble()*(b-a)+a;
            }
        }
    }

    public int getRows() {
        return rows;
    }

    public int getColums(){
        return colums;
    }

    public void printMatrix(){
        for(int i=0; i<rows; ++i){
            for(int j=0; j<colums; ++j){
                System.out.printf("%10.2f", data[i][j]);
            }
            System.out.println();
        }
    }

    public static Matrix add(Matrix m1, Matrix m2) {
        if (m1.colums != m2.colums || m1.rows != m2.rows) {
            System.out.println("Nem osszeadhato a ket matrix!");
            return null;
        }
        Matrix result = new Matrix(m1.rows, m1.colums);
        for (int i = 0; i < m1.rows; ++i) {
            for (int j = 0; j < m1.colums; ++j) {
                result.data[i][j] = m1.data[i][j] + m2.data[i][j];
            }
        }
        return result;
    }

    public static Matrix multiply (Matrix m1, Matrix m2){
        //if(m1.colums!= m2.rows){
            //System.out.println("Nem osszeszorozhato a ket matrix!");
            //return null;
        //}
        double sum =0;
        Matrix result = new Matrix(m1.rows, m1.colums);
        for (int i = 0; i < m1.rows; i++) {
            for (int j = 0; j < m2.colums; j++) {
                for (int k = 0; k < m2.rows; k++) {
                    sum = sum + m1.data[i][k] * m2.data[k][j];
                }

                result.data[i][j] = sum;
                sum = 0;
            }
        }
        return result;
    }
    public static Matrix transpose(Matrix m){
        Matrix result = new Matrix(m.colums, m.rows);
        for(int i=0; i<m.colums; ++i){
            for(int j=0; j<m.rows;++j){
                result.data[i][j] = m.data[j][i];
            }
        }
        return result;
    }
}