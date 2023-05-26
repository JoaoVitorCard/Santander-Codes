public class newApp {
  public static void main(String[] args) throws Exception {
    boolean fazSol = true;
    boolean fimDeSemana = false;
    boolean vamosAPraia = fazSol && fimDeSemana;
    String mensagem = vamosAPraia ? "Sim! Vamos a praia." : "Não, infelizmente não iremos.";
    System.out.println("Vamos a praia?:");
    System.out.println(mensagem);
  }
}
