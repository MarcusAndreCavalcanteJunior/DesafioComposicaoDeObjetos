public class FolhaPagamento {

    Holerite calcularSalario (double quantidadeHorasNormais ,
                           double quantidadeHorasExtras ,
                            ContratoTrabalho contrato
                           ) {
        Holerite holerite = new Holerite();

        holerite.funcionario = contrato.funcionario;

        holerite.valorTotalHorasNormais =
                quantidadeHorasNormais * contrato.valorHoraNormal;
        holerite.valorTotalHorasExtras =
                quantidadeHorasExtras * contrato.valorHoraExtras;



        if (contrato.funcionario.temFilhos()) {
            holerite.valorAdcionalFilhos =
                    (holerite.valorTotalHorasNormais +
                     holerite.valorTotalHorasExtras) * 0.10;
        }

        return holerite;

    }
}
