import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {

       System.out.println("Bem vindo a sua Agenda de contatos."); //Apresentação do Programa

       ArrayList<Contato> nomes_contatos = new ArrayList<>(); // criação da Lista que será usada para adicionar os contatos.
       
       Scanner leitor = new Scanner(System.in); // criação do Scanner para leitura da entrada do usuario

        do {
            // Exibição do menu: 
            System.out.println("Escolha uma das opções: ");
            System.out.println("[1] Adicionar contato: ");
            System.out.println("[2] Editar contato: ");
            System.out.println("[3] Encontrar contato:");
            System.out.println("[4] Excluir contato: ");
            System.out.println("[5] Sair da Agenda.");

            int opcao_Escolhida = leitor.nextInt();  //variavel para armazenar a opção escolhida pelo usuario

            Switch (opcao_Escolhida) {

                
            }
        } while ();



       leitor.close(); // fechamento do Scanner.
    }
}