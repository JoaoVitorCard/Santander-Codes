import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulandoStrings {
  // String nome = "João Vitor";
  // System.out.println(nome.toUpperCase());
  // System.out.println(nome.toLowerCase());
  // System.out.println(nome.length());

  // String outroNome = "joão Vitor";

  // System.out.println(outroNome == nome);
  // System.out.println(outroNome != nome);
  // System.out.println(outroNome.equals(nome));
  // System.out.println(outroNome.equalsIgnoreCase(nome));
  public static void main(String[] args) throws Exception {
    // Olá, nome. Hoje é {dia-da-semana}, BOM DIA.

    String nome = "João Vitor";

    // ISO 8601 - Data padrão

    LocalDate hoje = LocalDate.now();
    Locale brasil = new Locale("pt", "BR");
    String diaDaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
    String saudacao = "";
    LocalDateTime agora = LocalDateTime.now();

    if (agora.getHour() >= 0 && agora.getHour() < 12) {
      saudacao = "Bom dia!";
    } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
      saudacao = "Boa tarde!";
    } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
      saudacao = "Boa noite!";
    }

    System.out.printf("Olá, %s. Hoje é %s, %S.%n", nome, diaDaSemana, saudacao);
  }
}
