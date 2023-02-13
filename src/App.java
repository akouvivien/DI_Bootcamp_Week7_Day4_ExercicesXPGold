import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import Exercice1.Exercice1;
import Exercice2.Exercice2;
import Exercice3.Exercice3;
public class App {




    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("exercice1\n");
        System.out.println("------ geuss A Number ------");
        //nombre aleatoire
        Random rand = new Random();
        int n = rand.nextInt(1000)+1;
        System.out.println("le nombre choix par l'ordianteur est " + n);

        //choix du nombre par l'utilisateur
        Exercice1.guessNumber(n);
        System.out.println("exercice2\n");
        System.out.println("\n------ nombre aleatoire entre a minimum et b maximum ------");
        System.out.println("entrez un nombre a minimum \n");
        int a = scanner.nextInt();

        System.out.println("entrez un nombre b maximum \n");
        int b = scanner.nextInt();
        Exercice2.random(a, b);


        System.out.println("exercice3\n");
        ArrayList<String> values =  new ArrayList<>();
        values.add("bonjour");
        values.add("bonsoir");
        values.add("pierre");
        values.add("aurevoir");
        values.add("amour");
        

       System.out.println(Exercice3.random(values));
  
    }
}
