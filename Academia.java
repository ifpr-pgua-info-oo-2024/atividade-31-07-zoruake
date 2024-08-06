public class Academia {

    private String nome = "Academia World Athletic";
    private String endereco = "R. Tókio, 472 - Parque Agari, Paranaguá - PR, 83215-220";
    private String telefone = "41 3424-1734";

    Academia(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
