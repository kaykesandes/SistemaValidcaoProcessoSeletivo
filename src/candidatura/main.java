package src.candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;;

public class main {

   public static void main(String[] args) {
      System.out.println("Processo Seletivo");
      String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana"};
      for(String canditato: candidatos){
         entrandoEmContato(canditato);
      }

   }

   static void entrandoEmContato(String candidato){
      int tentativasRalizadas = 0;
      boolean continuarTentando= true;
      boolean atendeu=false;
      do{
         atendeu = atender();
         continuarTentando = !atendeu;
         if(continuarTentando){
            tentativasRalizadas++;
         }else{
            System.out.println("Candidato " + candidato + " atendeu a ligação após " + tentativasRalizadas + " tentativas");
         }
      }while(continuarTentando && tentativasRalizadas < 3);

      if(!atendeu){
         System.out.println("Candidato " + candidato + " não atendeu a ligação após " + tentativasRalizadas + " tentativas");
      }else{
         System.out.println("Candidato " + candidato + " atendeu a ligação após " + tentativasRalizadas + " tentativas");
      }

   }


   static void imprimirSelecionados(){
      String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana"};
      System.out.println("Candidatos selecionados: ");
      for(int i = 0; i < 5; i++){
         System.out.println("O candidato de n" + i + " Nome:" + candidatos[i]);
      }
      System.out.println("Forma abreviada de intereção for each");
      for(String candidato : candidatos){
         System.out.println("Candidato: " + candidato);
      }
   }

   static boolean atender(){
      return new Random().nextInt(3) == 1;
   }

   static void selecaoCandidatos(){
      String [] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana"};
      int candidatosSelecionados = 0;
      int candidatosAtual = 0;
      double salarioBase = 2000.00;
      double salarioPretendido = 2000.0;
      while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
         String candidato = candidatos[candidatosAtual];
         salarioPretendido = valorPretendido();

         System.out.println("Candidato: " + candidato + "Soliciotu este valor de salário: " + salarioPretendido);
         if(salarioBase >= salarioPretendido)
         {
            System.out.println("O candidato " + candidato + " foi selecionado");
            candidatosSelecionados++;
         }
         candidatosAtual++;
      }

   }

   static double valorPretendido(){
      return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
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