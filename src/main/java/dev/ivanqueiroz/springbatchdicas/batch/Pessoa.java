package dev.ivanqueiroz.springbatchdicas.batch;

public class Pessoa {

  private String primeiroNome;
  private String ultimoNome;

  public Pessoa() {
  }

  public Pessoa(String primeiroNome, String ultimoNome) {
    this.primeiroNome = primeiroNome;
    this.ultimoNome = ultimoNome;
  }

  public String getPrimeiroNome() {
    return primeiroNome;
  }

  public void setPrimeiroNome(String primeiroNome) {
    this.primeiroNome = primeiroNome;
  }

  public String getUltimoNome() {
    return ultimoNome;
  }

  public void setUltimoNome(String ultimoNome) {
    this.ultimoNome = ultimoNome;
  }

  @Override
  public String toString() {
    return "Pessoa{" + "primeiroNome='" + primeiroNome + '\'' + ", ultimoNome='" + ultimoNome + '\'' + '}';
  }
}
