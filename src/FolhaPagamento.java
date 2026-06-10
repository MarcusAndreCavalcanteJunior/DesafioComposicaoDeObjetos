public class FolhaPagamento {

    double calcularSalario (double quantidadeHorasNormais ,
                           double quantidadeHorasExtras ,
                            ContratoTrabalho contrato
                           ) {
        double totalHorasNormais = quantidadeHorasNormais * contrato.valorHoraNormal;
        double totalHorasExtras = quantidadeHorasExtras * contrato.valorHoraExtras;
        double salarioTotal = totalHorasNormais + totalHorasExtras;

        if (contrato.funcionario.temFilhos()) {
            salarioTotal = salarioTotal * 1.10;
        }

        return salarioTotal;

    }
}
