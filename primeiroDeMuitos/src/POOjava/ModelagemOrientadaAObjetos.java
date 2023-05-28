package POOjava;

import POOjava.Animais.Cachorro;

public class ModelagemOrientadaAObjetos {
  public static void main(String[] args) {

    Cachorro cachorro1 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "carinho");

    System.out.println(cachorro1.getNumeroDeCachorro());
    // Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "carinho");
    Cachorro cachorro2 = new Cachorro("Rex", "Branco", 10, 10.5, 5, "carinho");
    System.out.println(cachorro1.getNumeroDeCachorro());
    System.out.println(cachorro2.getNumeroDeCachorro());

  }
}