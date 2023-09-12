package iphone;

public class Iphone implements Musica, Navegador, Telefone{
    
  public static void main(String[] args) {
    
  }
  @Override
  public void ligar(int numeroTelefone) {
  System.out.println("Ligando para o numero: " + numeroTelefone);;
  }

  @Override
  public void atender() {
  System.out.println("Atendendo telefone");;
  }

  @Override
  public void iniciarCorreioVoz(int numeroTelefone) {
   System.out.println("Deixando mensagem para o numero: " + numeroTelefone);
  }

  @Override
  public void exibirPagina(String nomePagina) {
    System.out.println("Abrindo pagina: " + nomePagina);
  }

  @Override
  public void adicionarNovaAba() {
    System.out.println("nova aba aberta.");
  }

  @Override
  public void atualizarPagina() {
    System.out.println("PaginaAtualiza");
  }

  @Override
  public void selecionarMusica(String nomeMusica) {
    System.out.println("Musica selecionada é : " + nomeMusica);;
  }

  @Override
  public void pausar() {
    System.out.println("Musica Pausada");
  }

  @Override
  public void tocar() {
    System.out.println("Musica tocando");
  }
}
