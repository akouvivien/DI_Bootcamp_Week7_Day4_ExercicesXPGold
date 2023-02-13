package Exercice3;

import java.util.ArrayList;
import java.util.Random;

public class Exercice3 {
    
    public static String random(ArrayList<String> values) {
        Random random = new Random();
        String result =" ";
        int aleatoire = random.nextInt(values.size());
        for (int i = 0; i < values.size(); i++) {
            if (i == aleatoire) {
              result = values.get(aleatoire).toString();
            }
            
        }

        return result;
        }
    
}