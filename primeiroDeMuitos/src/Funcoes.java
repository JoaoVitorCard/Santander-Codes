public class Funcoes {
  public static void main(String[] args) throws Exception {
    String nomeOriginal = "João Vitor";
    saudacao(nomeOriginal);

    int resultado = soma(2, 3);
    System.out.println(resultado);
  }

  public static void saudacao(String nomeParametro) {
    System.out.println("Hello, " + nomeParametro);

  }

  public static int soma(int num1, int num2) {
    return num1 + num2;
  }
}