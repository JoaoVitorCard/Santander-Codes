package POOjava.Animais;

public class Passaro extends Animal {
  public Passaro(String nome, String cor, double peso) {
    super(nome, cor, peso);
  }

  static int numeroDePassaros;

  @Override
  public String toString() {
    return "Pássaro{" + "nome='" + nome + '\'' + '}';
  }

  @Override
  public void soar() {
    System.out.println("PIU PIU!!");
  }
}
