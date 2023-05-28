package POOjava;

import POOjava.Cachorro.Cachorro;

public class Encapsulameno {
  public static void main(String[] args) {

    Cachorro cachorro1 = new Cachorro();

    cachorro1.setNome("Puppy");
    cachorro1.setCor("Marrom");
    cachorro1.setAltura(25);
    cachorro1.setPeso(5.5);
    cachorro1.setTamanhoDoRabo(5);

    cachorro1.latir();
    System.out.println("O cachorro pegou uma " + cachorro1.pegar());
    System.out.println("O cachorro está " + cachorro1.interagir("cala a boca"));
  }
}
