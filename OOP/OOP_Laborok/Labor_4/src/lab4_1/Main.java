package lab4_1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = null;
        try{
             scanner = new Scanner(new File("Labor_4/lab4_1_input.txt"));
             System.out.println("try blokk");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Nem talalhato fajl!");
            //kilepes a programbol;
            System.exit(1);
        }
        //System.out.println("itt vagyok");
        int lineCounter = 0;
        while( scanner.hasNextLine()){
            String line = scanner.nextLine();
            ++lineCounter;
            System.out.println(lineCounter + "." +  line);
        }


        //2 feladat
        try{
            scanner = new Scanner(new File("Labor_4/lab4_1_input.csv"));
            System.out.println("try blokk");
        }catch (FileNotFoundException e){
            e.printStackTrace();
            System.out.println("Nem talalhato fajl!");
            //kilepes a programbol;
            System.exit(1);
        }
        ArrayList <Person> persons = new ArrayList<>();
        System.out.println(persons.size());
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.isEmpty()){
                continue;
            }
            String[] items = line.split(",");
            String firstName = items[0].trim();
            String lastName = items[1].trim();
            int birthYear = Integer.parseInt(items[2].trim());

            persons.add(new Person(items[0].trim(), items[1].trim(), Integer.parseInt(items[2].trim())));
            }
            for(Person person:persons){
                System.out.println(person);
        }
    }

}
