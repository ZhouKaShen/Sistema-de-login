package Menu;

public class Cadastro {
    private String usuario;
    private String senha;

    public Cadastro(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    @Override
    public String toString() {
        String informacao = "==============================================\n";
        informacao += String.format("Seja Bem-Vindo: %s", this.usuario + "!\n");
        return informacao;
    }

    // getters e setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
