package Feladat_1;

import java.util.ArrayList;

public class Informatika {

    private ArrayList<Diak> diakok = new ArrayList<>();

    public static void ujBeiratkozo(Diak diak){

        diakok.add(diak);
    }

    public int felvetelizokSzama(){
        return diakok.size();
    }

    public double felvetelizokAtlaga(){
        double felvetelizokAtlag = 0 ;
        for( Diak diak:diakok){
            felvetelizokAtlag += diak.atlag();
        }
        return felvetelizokAtlag/felvetelizokSzama();
    }

    public void listazOsszes(){
        for(Diak diak:diakok){
            System.out.println(diak);
        }
    }

    public void listazAtlag(double x ){
        for(Diak diak:diakok){
            if(diak.atlag() > x){
                System.out.println(diak);
            }
        }
    }
}
