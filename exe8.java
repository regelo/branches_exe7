package projet6dec;

import java.util.Scanner;

public class BrancheExe8 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Entrez une note entière entre 0 et 100 : ");

        int note = -1;

        boolean tampon_contient_entier = clavier.hasNextInt();
        if (tampon_contient_entier == true) {
            note = clavier.nextInt();
        }

        // Je ne vide pas le tampon vu que je ne fais pas d'autres lectures.
        clavier.close();

        char lettre = 'I';
        if (note >= 0 && note < 60)
            lettre = 'F';
            System.out.println("Votre note est : " + lettre);
        if (note >= 60 && note < 70)
            lettre = 'D';
            System.out.println("Votre note est : " + lettre);
        if (note >= 70 && note < 80)
            lettre = 'C';
            System.out.println("Votre note est : " + lettre);
        if (note >= 80 && note < 90)
            lettre = 'B';
            System.out.println("Votre note est : " + lettre);
        if (note >= 90 && note <= 100)
            lettre = 'A';
            System.out.println("Votre note est : " + lettre);
        
    }
}
