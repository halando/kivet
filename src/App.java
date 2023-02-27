import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args)  {

        // try {
        //     System.out.println(8 / 0);
        // } catch (ArithmeticException e) {
        //     System.err.println("Hiba! Osztás 0-val");
        //     System.err.println(e.getMessage());
        // }

        // try {
        //     Scanner scanner = new Scanner(System.in);
        //     String radiusStr = scanner.nextLine();
        //     int radius = Integer.parseInt(radiusStr);
        // } catch (NumberFormatException e) {
        //     System.err.println("Hiba! Csak számok adhatók meg!");
        //     System.err.println(e.getMessage());
        //     System.err.println(e.getStackTrace());
        // }
        try {
            File file = new File("adat.txt");
            Scanner scanner = new Scanner(file, "utf-8");
            ArrayList<Fruit> fruitList = new ArrayList<>();
            while(scanner.hasNextLine()){
                String line =scanner.nextLine();
                String[] lineArray =line.split(":");
                int quantity = Integer.parseInt(lineArray[1]);
                Fruit fruit = new Fruit(lineArray[0], quantity);
                fruitList.add(fruit);
                System.out.println();
            }
            //Lista bejárása
            for(Fruit fruit: fruitList){
                System.out.println(fruit.name);
            }
           
        } catch (FileNotFoundException e) {
            System.err.println("Hiba!A fájl nem található!");
           
        }

      
        // try {
        //     FileWriter fw = new FileWriter("adat.txt",
        //     Charset.forName("utf-8"), true);
        //     PrintWriter pw = new PrintWriter(fw);
        //     pw.println("alma");
        //     pw.println("körte");
        //     pw.println("barack");
        //     pw.close();
        // } catch (IOException e) {
        //    System.err.println("Hiba!A fájl nem található");
        // }
       
    }
}
