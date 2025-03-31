import Menu.Cadastro;
import Menu.Cadastros;
import java.util.*;

public class Login {
    public static void main(String[] args) {

        // Cadastro de usuários
        Cadastro cadastro = new Cadastro("Fernanda", "123");
        Cadastro cadastroA = new Cadastro("Fernando", "456");
        Cadastro cadastroB = new Cadastro("Mario", "789");

        Cadastros cadastros = new Cadastros();

        // Adicionando usuários no sistema
        cadastros.adicionar(cadastro);
        cadastros.adicionar(cadastroA);
        cadastros.adicionar(cadastroB);

        // Logando no sistema
        System.out.println(cadastros.logar("Fernanda", "123"));
        System.out.println(cadastros.logar("Fernando", "456"));
        System.out.println(cadastros.logar("Mario", "789"));

    }
}