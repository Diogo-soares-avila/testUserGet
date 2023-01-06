
package pojo;

public class AtualizarValidacoes {
    //1 - escrever atributos
    private String email;
    private String telefone;

    //3 - gerar construtor
    public AtualizarValidacoes(){  }

    //2 - gerar getters e setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}