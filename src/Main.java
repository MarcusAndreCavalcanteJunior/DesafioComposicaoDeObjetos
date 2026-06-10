public class Main {

    public static void main(String[] args) {

        FolhaPagamento folha = new FolhaPagamento();

        Funcionario funcionario = new Funcionario();
        funcionario.nomeFuncionario = "Carlos";
        funcionario.quantidadeFilhos = 2;

        ContratoTrabalho contrato = new ContratoTrabalho();
        contrato.funcionario = funcionario;
        contrato.valorHoraNormal = 10.0;
        contrato.valorHoraExtras = 22.0;

        double quantidadeHorasNormais = 335.0;
        double quantidadeHorasExtras = 44.0;

        double totalSalario = folha.calcularSalario(quantidadeHorasNormais,
                quantidadeHorasExtras, contrato);

        System.out.println("O salário foi de " + totalSalario);

    }
}
