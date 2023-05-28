public class Conditionals {
  public static void main(String[] args) throws Exception {
    int nota = 0;
    String graduacao;

    // A = 90, B = 70, C = 60, D = 30, F = 0

    if (nota >= 90) {
      graduacao = "A";
      System.out.println("Nota do aluno: A");
    } else if (nota >= 70) {
      graduacao = "B";
      System.out.println("Nota do aluno: B");
    } else if (nota >= 60) {
      graduacao = "C";
      System.out.println("Nota do aluno: C");
    } else if (nota >= 30) {
      graduacao = "D";
      System.out.println("Nota do aluno: D");
    } else if (nota >= 0) {
      graduacao = "F";
      System.out.println("Nota do aluno: F");
    } else {
      graduacao = null;
      System.out.println("Nota inválida!");
    }

    switch (graduacao) {
      case "A":
      case "B":
        System.out.println("Aluno aprovado!");
        break;
      case "C":
      case "D":
        System.out.println("Aluno de recuperação!");
        break;
      case "F":
        System.out.println("Aluno reprovado!");
        break;
      default:
        System.out.println("Graduação Inválida!");
    }
  }
}