import java.util.ArrayList;

public class Funcoes {
    
    // Função para Adicionar Contato
    public static void adicionarContato (ArrayList<Contato> nomes_Contatos, String nome, String email) {
        nomes_Contatos.add(new Contato(nome, email));
        System.out.println("O contato " + nome + " e seu email: " + email + ", foram adicionados!");
    }
}
