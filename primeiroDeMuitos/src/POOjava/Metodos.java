package POOjava;

import POOjava.Animais.Cachorro;

public class Metodos {
  public static void main(String[] args) {

    Cachorro cachorro1 = new Cachorro(null, null, 0, 0, 0, null);

    cachorro1.nome = "Puppy";
    cachorro1.cor = "Marrom";
    cachorro1.altura = 25;
    cachorro1.peso = 5.5;
    cachorro1.tamanhoDoRabo = 5;

    cachorro1.soar();
    System.out.println("O cachorro pegou uma " + cachorro1.pegar());
    System.out.println("O cachorro está " + cachorro1.interagir("Cala a boca"));
  }
}
