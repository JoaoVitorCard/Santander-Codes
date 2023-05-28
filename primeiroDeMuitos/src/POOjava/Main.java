package POOjava;

import POOjava.Animais.Cachorro;
import POOjava.Animais.Gato;
import POOjava.Animais.Passaro;

public class Main {
  public static void main(String[] args) {

    Cachorro cachorro = new Cachorro("Puppy", "Marrom", 25, 5.5, 5, "carinho");
    Gato gato = new Gato("Felix", "Preto", 4.5);
    Passaro passaro = new Passaro("Frajola", "Azul", 0.5);

    cachorro.soar();
    gato.soar();
    passaro.soar();
  }
}