public class LacosNumericos {
  public static void main(String[] args) throws Exception {
    // 1 2 3 4 5 6 7 8 9 10
    // Para uma variável que inicia em 1 e vai até 10, mudando 1-por-1, faça:
    for (int i = 1; i <= 10; i++) {
      for (int j = 1; j <= 10; j++) {
        System.out.println(i + " x " + j + " = " + i * j);
      }
    }
  }
}
