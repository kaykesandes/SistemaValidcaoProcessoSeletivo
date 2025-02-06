package src.candidatura;

public class main {

   public static void main(String[] args) {
      System.out.println("Processo Seletivo");
      analisarCandidato(1900.0);
      analisarCandidato(2200.0);
      analisarCandidato(2000.0);
   }

   static void analisarCandidato(double salarioPretendido) {
      double salarioBase = 2000.0;

      if (salarioBase > salarioPretendido) {
         System.out.println("Ligar para candidato");
      } else if (salarioBase == salarioPretendido) {
         System.out.println("Ligar para candidato com outra proposta");
      } else {
         System.out.println("Aguardar resultado demais candidatos");
      }
   }
}