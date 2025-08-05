import java.util.ArrayList;



public class Funcoes {
    
    // Função para Adicionar Contato
    public static void adicionarContato (ArrayList<Contato> nomes_Contatos, String nome, String email) {

        nomes_Contatos.add(new Contato(nome, email));
        System.out.println("O contato " + nome + " e seu email: " + email + ", foram adicionados!");
        
    }


    // Função para listar contato
    public static void listarContato (ArrayList<Contato> nome_Contatos) {
        if (nome_Contatos.isEmpty()) {
            System.out.println("Nenhum contato foi cadastrado ainda.");
        } else {
            System.out.println("Estes são seus contatos salvos: ");
            int contador = 1;
        for (Contato contato : nome_Contatos) {
            System.out.println(contador + " - Nome: " + contato.getNome());
            System.out.println("    Email: " + contato.getEmail());
            System.out.println("-------------------------------");
            contador++;
            }
        }
    }
    
}
