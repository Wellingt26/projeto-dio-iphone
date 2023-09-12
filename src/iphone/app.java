package iphone;

import java.util.Scanner;

public class app {
  public static void main(String[] args) {
    String respostaUsuario;
    String nomeMusica;
    int numeroTelefone;
    String nomePagina;

    Scanner scanner =  new Scanner(System.in);

    System.out.println("Menu Iphone");
    System.out.println("1 - musica");
    System.out.println("2 - Telefone");
    System.out.println("3 - Navegador");

    respostaUsuario = scanner.nextLine();

    Iphone iphone = new Iphone();

    switch (respostaUsuario) {
      case "1":
        System.out.println("Digite nome da musica: ");
        nomeMusica = scanner.nextLine();
        iphone.selecionarMusica(nomeMusica);
        iphone.tocar();
        iphone.pausar();
        break;

      case "2":
        System.out.println("Digite o numero desejado: ");
        numeroTelefone = scanner.nextInt();
        iphone.ligar(numeroTelefone);
        iphone.iniciarCorreioVoz(numeroTelefone);
        iphone.atender();
        break;
      case "3":
        System.out.println("Qual pagina deseja entrar :");
        nomePagina = scanner.nextLine();
        iphone.exibirPagina(nomePagina);
        iphone.atualizarPagina();
        iphone.adicionarNovaAba();
        break;

      default:
      System.out.println("Opção incorreta");
    }
  }
}
