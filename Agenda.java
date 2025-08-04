import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

       System.out.println("Bem vindo a sua Agenda de contatos."); //Apresentação do Programa

       ArrayList<Contato> nomes_contatos = new ArrayList<>(); // criação da Lista que será usada para adicionar os contatos.
       int opcao_Escolhida;
       Scanner leitor = new Scanner(System.in); // criação do Scanner para leitura da entrada do usuario

        do {
            // Exibição do menu: 
            System.out.println("Escolha uma das opções: ");
            System.out.println("[1] Adicionar contato: ");
            System.out.println("[2] Editar contato: ");
            System.out.println("[3] Encontrar contato:");
            System.out.println("[4] Excluir contato: ");
            System.out.println("[5] Sair da Agenda.");

            opcao_Escolhida = leitor.nextInt();  //variavel para armazenar a opção escolhida pelo usuario
            leitor.nextLine(); //Limpar o buffer

            switch (opcao_Escolhida) {
                
                case 1: // opção para dicionar contato e email
                    System.out.println("Informe o nome que deseja adicionar: ");
                    String nome = leitor.nextLine();
                    System.out.println("Informe o email do contato: ");
                    String email = leitor.nextLine();
                    Funcoes.adicionarContato(nomes_contatos, nome, email);
                    break;

                default:
                    System.out.println("Opção invalida.");
            }
        } while (opcao_Escolhida != 3);



       leitor.close(); // fechamento do Scanner.
    }
}