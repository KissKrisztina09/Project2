package Lab4_3;

public class Main {
    public static void main(String[] args){
 //       MyArray a1 = new MyArray(10);
  //      a1.print("a1");
  //      a1.fillRandom(23, 80);
 //       a1.print("a1");
//        a1.sort();
 //       a1.print("a1");
     //   System.out.printf("%\tMean:%10.2f Stddev:%10.5f\n", a1.mean(), a1.stddev());
        double[] t = {4, 9, 0, 54, 67, 23, 4, 8, 9, 1};
        MyArray a2 = new MyArray(t);
        a2.print("a2");
        a2.sort();
        a2.print("a2");
        System.out.printf("\tMean:%10.2f Stddev:%10.2f\n", a2.mean(), a2.stddev());

    }
}
