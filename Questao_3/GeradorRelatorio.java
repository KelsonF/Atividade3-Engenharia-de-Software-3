package Atividade_3.Questao_3;

import java.util.List;

public class GeradorRelatorio {
   public void gerarRelatorio(
      String cpfContribuinte, 
      List<Double> rendimentos, 
      List<Double> despesas,
      double impostoDevido
   ) {

      System.out.println("CPF: " + cpfContribuinte);
      System.out.println("Rendimentos: " + rendimentos);
      System.out.println("Despesas: " + despesas);
      System.out.println("Imposto Devido: " + impostoDevido);

   }
}
