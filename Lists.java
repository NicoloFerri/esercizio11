package co.develhope.introduction._11;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
     List<String> cityNames = Arrays.asList("New York","Rome","Tokyo");

     //cityNames.add("Berlino");
        //cityNames.remove(0);

        //l'array è nella forma 'not mutable' quindi una volta che gli ho dato una dimesione
        // non posso ne aggiungere ne togliere elementi

        System.out.println(cityNames);

        cityNames.set(1,"Tegucigalpa");
        System.out.println(cityNames);

        ArrayList<String> kingsOfRome = new ArrayList<>();
        kingsOfRome.add("Romolo");
        kingsOfRome.add("Numa pompilio");
        kingsOfRome.add("Tullo Ostilio");
        kingsOfRome.add("Anco Marzio");
        kingsOfRome.add("Lucio Tarquinio Prisco");
        kingsOfRome.add("Servio Tullio");
        kingsOfRome.add("Lucio Tarquinio Superbo");

        System.out.println(kingsOfRome);

       String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);

       kingsOfRomeArray[6]="Lucius tarquinius Supercar";

       for ( int i =0 ; i<kingsOfRomeArray.length ; i++){
          System.out.println(kingsOfRomeArray[i]);
       }







    }
}
