public class Funcionario {

    String nomeFuncionario;
    int quantidadeFilhos;

    boolean temFilhos () {
        if (quantidadeFilhos > 0) {
            return true;
        }
        return false;
    }

}
