package projet6dec;

import java.util.Scanner;

public class BrancheExe7 {
    public static void main(String[] args) {
        System.out.println("Entrez le rayon du cercle (type double) : ");

        Scanner clavier = new Scanner(System.in);

        double rayon = 0;

        boolean tampon_contient_double = clavier.hasNextDouble();
        if (tampon_contient_double == true) {
            // Le tampon contient bien un double.
            rayon = clavier.nextDouble();
        }

        // Ou bien, la lecture a bien fonctionné. Dans ce cas, le nextDouble() a laissé
        // traîné un '\n' dans le tampon.
        // Ou bien la lecture n'a pas été faite. Dans ce cas, mon tampon contient du
        // garbage, suivi de '\n'.
        // Dans les deux cas, on est aussi bien de vider le tampon.
        clavier.nextLine();

        System.out.println("  1. Utiliser le Pi de la librairie Math");
        System.out.println("  2. Utiliser 22/7 pour la valeur de Pi");
        System.out.println("  3. Utiliser 3.14 pour la valeur de Pi");
        System.out.print("Choix : ");

        int choix = 1;
        boolean tampon_possede_entier = clavier.hasNextInt();
        if (tampon_possede_entier == true) {
            // Notre tampon a bien un entier, on le lit.
            choix = clavier.nextInt();
        }

        // Ou bien, la lecture a bien fonctionné. Dans ce cas, le nextInt() a laissé
        // traîné un '\n' dans le tampon.
        // Ou bien la lecture n'a pas été faite. Dans ce cas, mon tampon contient du
        // garbage, suivi de '\n'.
        // Dans les deux cas, on est aussi bien de vider le tampon.
        clavier.nextLine();

        clavier.close();

        double pi = 0;
        switch (choix) {
            case 1:
                pi = Math.PI;
            case 2:
                pi = 22 / 7.0;
            case 3:
                pi = 3.14;
            default:
                pi = 0;
        }

        double perimetre = 2 * pi * rayon;
        System.out.println("Périmètre = " + perimetre);
    }
}
