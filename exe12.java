class Main {
  public static void main(String[] args) {

    float fraction = 1;
    System.out.println("1/1 = " + fraction); 

    fraction = fraction / 97.0f;
    System.out.println("1/97 = " + fraction);
    fraction = fraction / 97.0f;
    System.out.println("1/9409" + fraction);
    fraction = fraction / 97.0f;
    System.out.println("1/912673 = " + fraction);

    fraction = fraction * 97.0f;
    System.out.println("1/9409 = " + fraction);
    fraction = fraction * 97.0f;
    System.out.println("1/97 = " + fraction);
    fraction = fraction * 97.0f;
    // Notez que la valeur rendue ici n'est pas tout à fait un. C'est pourquoi la comparaison qui suit ne fonctionne pas. 
    System.out.println("1/1 = " + fraction); 

    // Il n'est pas recommandé d'utiliser l'opérateur == avec des variables flottantes à cause de ce genre de problèmes ...
    if (fraction == 1) System.out.println("Calcul effectué");
    else System.out.println("Erreur !");
  }
}
