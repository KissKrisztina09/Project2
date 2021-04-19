package labor9_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<MyDate> myDateList = new ArrayList<MyDate>();
        int year = 2021;
        Random rand = new Random();
        while( myDateList.size() < 10){
            int month = rand.nextInt(12);
            int day = rand.nextInt(31);
            if( DateUtil.isValidDate(year, month, day)){
                myDateList.add( new MyDate( year, month, day));
            }
        }
        for(MyDate date:myDateList){
            System.out.println(date);
        }
        System.out.println();

        Collections.sort(myDateList);
        System.out.println("Rendezes utan a datumok: ");
        for(MyDate date:myDateList){
            System.out.println(date);
        }
        System.out.println();
    }
}
