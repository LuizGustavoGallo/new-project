// classe para representar contatos
public class Contato {
    
    private String nome;
    private String email;

        // Construção do metodo
    public Contato(String nome, String email) {
        // diferenciando os atribudos do metodo
        this.nome = nome;
        this.email = email;
    }

    // metodos para retorno do valor
    public String getNome() { // retorno do nome
        return nome;    
    }

    public String getEmail() { // retorno do email
        return email; 
    }
    
    // Setter para edição de contato
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
