package Atividade_3.Questao_2;

public class Calculadora {
   private final Double a;
   private final Double b;

   public Calculadora(double a, double b) {
      this.a = a;
      this.b = b;
   }

   public double getA() {
      return a;
   }

   public double getB() {
      return b;
   }

   public Double calcular(Operacao operacao){
      return operacao.executar(this.a, this.b);
   }

}

