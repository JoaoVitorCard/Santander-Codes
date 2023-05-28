package POOjava.Cachorro;

public class Cachorro {

  // Atributos
  private String nome;
  private String cor;
  private int altura;
  private double peso;
  private int tamanhoDoRabo;
  private String estadoDeEspirito;

  // Construtores

  public Cachorro() {
  }

  public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
    this.nome = nome;
    this.cor = cor;
    this.altura = altura;
    this.peso = peso;
    this.tamanhoDoRabo = tamanhoDoRabo;
    this.estadoDeEspirito = estadoDeEspirito;
  }

  // Métodos
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCor() {
    return this.cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public int getAltura() {
    return this.altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public double getPeso() {
    return this.peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getTamanhoDoRabo() {
    return this.tamanhoDoRabo;
  }

  public void setTamanhoDoRabo(int tamanhoDoRabo) {
    this.tamanhoDoRabo = tamanhoDoRabo;
  }

  public String getEstadoDeEspirito() {
    return this.estadoDeEspirito;
  }

  public void latir() {
    System.out.println("AU, AU");
  }

  public String pegar() {
    return "Bolinha";
  }

  public String interagir(String acao) {
    // if (acao.equals("carinho")) {
    // this.estadoDeEspirito = "Feliz";
    // } else if (acao.equals("Cala a boca")) {
    // this.estadoDeEspirito = "chateado";
    // } else if (acao.equals("pisar na patinha")) {
    // this.estadoDeEspirito = "triste";
    // } else {
    // this.estadoDeEspirito = "Neutro";
    // }
    // return estadoDeEspirito;

    switch (acao) {
      case "carinho":
        this.estadoDeEspirito = "Feliz";
        break;
      case "cala a boca":
        this.estadoDeEspirito = "Magoado";
        break;
      case "pisar na patinha":
        this.estadoDeEspirito = "Triste";
        break;
      default:
        this.estadoDeEspirito = "Neutro";
        break;
    }
    return estadoDeEspirito;
  }
}