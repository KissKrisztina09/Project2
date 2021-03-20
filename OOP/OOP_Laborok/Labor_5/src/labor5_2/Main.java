package labor5_2;

import static labor5_2.Matrix.multiply;
import static labor5_2.Matrix.transpose;

public class Main {
    public static void main (String [] args){
      Matrix m = new Matrix(3, 5);
      //m.printMatrix();
      System.out.println();
      m.fillRandom(2,5);
      m.printMatrix();
      System.out.println();
      Matrix m2 = new Matrix(3, 5);
      m2.fillRandom(4, 20);
      m2.printMatrix();
      System.out.println();
      System.out.println("A szorzat:");
      multiply(m, m2).printMatrix();
      System.out.println("A matrix transzponaltja:");
      transpose(m).printMatrix();

    }
}
