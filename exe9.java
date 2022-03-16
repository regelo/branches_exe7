package projet6dec;

import java.util.Scanner;

public class BrancheExe9 {
    public static void main(String[] args) {
        System.out.println("Entrez une valeur entière : ");

        Scanner clavier = new Scanner(System.in);

        boolean tampon_contient_entier = clavier.hasNextInt();
        if (tampon_contient_entier == true) {
            int valeur = clavier.nextInt();
        }

        // On vide le tampon.
        clavier.nextLine();

        clavier.close();

        if (valeur % 2 == 0)
            System.out.println("Valeur paire !");
        else
            System.out.println("Valeur impaire !");
    }
}
