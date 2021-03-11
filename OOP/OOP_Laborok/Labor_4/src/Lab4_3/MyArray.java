package Lab4_3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;

public class MyArray {
    private int length;
    private double[] elements;

    public MyArray(int length) {
        this.length = length;
    }

    public MyArray(double[] elments) {
        this.elements = elments;
        this.length = elments.length;
    }

    public MyArray(MyArray myarray){
        this.length = myarray.length;
        this.elements=myarray.elements;
    }

    public MyArray(String file){
        Scanner scanner= null;
        try{
            scanner = new Scanner(new File(file));

        }catch(FileNotFoundException e){
            e.printStackTrace();
            System.exit(1);
        }
        String line = scanner.nextLine();
        int length = Integer.parseInt(line);
        line = scanner.nextLine();
        String[] elments = line.split(" ");
        for(int i=0; i<this.length; ++i) {
            this.elements[i] = Integer.parseInt(elments[i]);
        }
    }

    public void fillRandom(int a, int b){
        Random rand = new Random();
        for(int i=a; i<b; i++){
            this.elements[i]=rand.nextInt(100);
        }
    }

    public double mean(){
        double s = 0;
        for(double element:this.elements){
            s += element;
        }
        return s/this.length;
    }
    public double stddev(){
        double t = mean();
        double[] mT = this.elements;
        double s=0;
        for( int i =0; i<this.length; ++i){
            mT[i] = this.elements[i]-t;
            mT[i] = mT[i]*mT[i];
            s += mT[i];
        }
        double dev = Math.sqrt(s/this.length);
        return dev;
    }
    public void sort(){
        Arrays.sort(this.elements);
    }
    public void print (String string){
        System.out.print(string+" ");
        for(double element:this.elements){
            System.out.printf("%10.2f", element);
        }
        System.out.println();
    }
}

