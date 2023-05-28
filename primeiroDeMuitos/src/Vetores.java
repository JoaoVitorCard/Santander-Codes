import java.util.Arrays;

public class Vetores {
  public static void main(String[] args) throws Exception {
    int[] numeros = new int[5];
    // [0] [1] [2] [3] [4]
    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;

    for (int i = 0; i < numeros.length; i++)
      System.out.println(numeros[i]);

    // ----------------------------------- //

    String[] letras = new String[5];

    letras[0] = "A";
    letras[1] = "B";
    letras[2] = "C";
    letras[3] = "D";
    letras[4] = "E";

    for (int i = 0; i < letras.length; i++) {
      System.out.println(letras[i]);
    }

    // ----------------------------------- //

    // Outra forma de criar arrays

    String[] maisLetras = { "F", "G", "H", "I", "J" };

    for (int i = 0; i < maisLetras.length; i++) {
      System.out.println(maisLetras[i]);
    }
    System.out.println(Arrays.toString(maisLetras));

    // ----------------------------------- //

    int numerosAleatorios[] = { 9, 10, 12, 25, 2 };
    int maior = numerosAleatorios[0];
    int menor = numerosAleatorios[0];
    int media = 0;

    for (int i = 0; i < numerosAleatorios.length; i++) {
      if (numerosAleatorios[i] > maior) {
        maior = numerosAleatorios[i];
      } else if (numerosAleatorios[i] < menor) {
        menor = numerosAleatorios[i];
      }

      media += numerosAleatorios[i];
    }

    System.out.println("Maior: " + maior);
    System.out.println("Menor: " + menor);
    System.out.println("Média: " + (float) media / numerosAleatorios.length);
  }
}
