package Atividade_3.Questao_2;

public class Main {
   Calculadora new_Calculadora = new Calculadora(10, 10);
   Operacao new_Operacao = new Soma();

   Double resultado = new_Calculadora.calcular(new_Operacao);
}
