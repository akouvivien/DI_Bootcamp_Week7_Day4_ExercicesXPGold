package Exercice1;

import java.util.Scanner;

public class Exercice1 {
    
    public static  void  guessNumber( int n) {
        try (Scanner scanner = new Scanner(System.in)) {
            int nbreChance =3;
                System.out.println("vous avez "+nbreChance+" chances");
            //execution de la comparaison  
            
                int i = 1;
                do {
                    System.out.println("------------------operation "+ i +" -------------------");
                    System.out.print("devinez un nombre ");
                     int nombre = scanner.nextInt();

                     nbreChance--;
                     System.out.println("nombre de chances restant "+nbreChance);
                    if (nombre < n) {
                        System.out.println("Faux, c’est trop petit.");
                        
                    } 
                    else if (nombre > n) {
                        System.out.println("Faux, c’est trop gros.");

                    } 
                    else  {
                        System.out.println("Oui, vous l’avez trouvé ! ");
                        
                        break;}

                    i++;
                } while (i <= nbreChance);
        }
    }
}