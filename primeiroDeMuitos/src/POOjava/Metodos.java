package POOjava;

import POOjava.Cachorro.Cachorro;

public class Metodos {
  public static void main(String[] args) {

    Cachorro cachorro1 = new Cachorro();

    cachorro1.nome = "Puppy";
    cachorro1.cor = "Marrom";
    cachorro1.altura = 25;
    cachorro1.peso = 5.5;
    cachorro1.tamanhoDoRabo = 5;

    cachorro1.latir();
    System.out.println("O cachorro pegou uma " + cachorro1.pegar());
    System.out.println("O cachorro está " + cachorro1.interagir("Cala a boca"));
  }
}
