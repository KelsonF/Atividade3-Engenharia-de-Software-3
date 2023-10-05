package Atividade_3.Questao_3;

import java.util.List;

import Atividade_3.Questao_4.ValidarImpostoDeRenda;

public class ImpostoDeRenda {
   private String cpfContribuinte;
   private List<Double> rendimentos;
   private List<Double> despesas;

   public ImpostoDeRenda(String cpfContribuinte, List<Double> rendimentos, List<Double> despesas) {
      this.cpfContribuinte = cpfContribuinte;
      this.rendimentos = rendimentos;
      this.despesas = despesas;
   }

   public void processar() {
      ValidarImpostoDeRenda calculadora = new ValidarImpostoDeRenda();
      double impostoDevido = calculadora.Validar(getCpfContribuinte(), getRendimentos(), getDespesas());

      GeradorRelatorio relatorio = new GeradorRelatorio();
      relatorio.gerarRelatorio(getCpfContribuinte(), getRendimentos(), getDespesas(), impostoDevido);
   }

   public String getCpfContribuinte() {
      return cpfContribuinte;
   }

   public List<Double> getRendimentos() {
      return rendimentos;
   }

   public List<Double> getDespesas() {
      return despesas;
   }
}
