package Atividade_3.Questao4;

import java.util.List;

import Atividade_3.Questao_3.CalculadoraImpostoDeRenda;

public class ValidarImpostoDeRenda {

   public Double Validar(String cpf,List<Double> rendimentos,List<Double> despesas){
      if(cpf.trim().length() != 11){
         throw new RuntimeException("O cpf deve conter exatos 11 caracteres");
      }

      for (Double despesa : despesas) {
         if(despesa  < 0){
            throw new RuntimeException("Despesas negativos nao sao permitidos");
         }
      }

      for (Double rendimento : rendimentos) {
         if (rendimento < 0) {
            throw new RuntimeException("Rendimentos negativos nao sao permitidos");
         }
      }

      if(rendimentos.size() > 5 ){
         throw new RuntimeException("O numero de rendimentos deve ser no maximo 5");
      }

      final CalculadoraImpostoDeRenda calculadoraImpostoDeRenda = new CalculadoraImpostoDeRenda();
      
      return calculadoraImpostoDeRenda.calcularImposto(rendimentos, despesas);
   }
}
