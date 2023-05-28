package POOjava.Lojas;

import POOjava.Animais.Animal;
import POOjava.Animais.Cachorro;

public class Petshop {
  public void darBanho(Animal animal) {
    animal.setEstadoDeEspirito("Limpo");
  }

  public void tosar(Cachorro cachorro) {
    cachorro.setEstadoDeEspirito("Tosado");
  }

  public void deixarNoHotel(Animal animal) {
    animal.setEstadoDeEspirito("Com saudade");
  }
}
