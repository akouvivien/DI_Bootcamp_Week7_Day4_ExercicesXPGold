package Exercice2;

import java.io.EOFException;
import java.util.Random;

public class Exercice2 {

    public static int random(int a, int b) {

        Random random = new Random();
        int aleatoire = random.nextInt(a - b + 1) + a;
        // return a or b, randomly
        return aleatoire;
        }
    
}