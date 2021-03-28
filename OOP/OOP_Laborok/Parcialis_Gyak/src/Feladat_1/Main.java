package Feladat_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Informatika felvetelizok = new Informatika();

        Scanner scanner = null;
        try{
            scanner = new Scanner(new File("Parcialis_Gyak/felveteli_gyak.txt"));
            System.out.println("try blokk");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Nem talalhato fajl!");
            //kilepes a programbol;
            System.exit(1);
        }

        ArrayList<Diak> diakok = new ArrayList<>();
        System.out.println(diakok.size());
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                continue;
            }
            String [] items = line.split(" ");
            String vnev = items[0].trim();
            String knev = items[1].trim();
            double erettsegi = Double.parseDouble(items[2].trim());
            double matematika = Double.parseDouble(items[3].trim());
            diakok.add(new Diak(items[0].trim(), items[1].trim(), Double.parseDouble(items[2].trim()), Double.parseDouble(items[3].trim())));
        }
        for(Diak diak:diakok){
            System.out.println(diak);
        }
    }
}
