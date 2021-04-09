package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao {
	
	public static void main(String[] args) {
		
		/* Jogador 1 irá digitar o número
		 * Jogador 2 ira tentar adivinhar o numero
		 * 
		 * Missão 1:
		 * - dê dicas ao jogador 2, se ele está chutando alto ou baixo
		 * 
		 * Missão2:
		 * - acrescentar na msgm de Parabéns quantas tentativas foram utilizadas para acertar
		 * 
		 * Dica: utilizar variável para contar 
		 *
		 *
		 *Missão1 - nesse código o "jog2=0" não funciona! precisa de mais um parse.Int antes do while e dai da problema no cont
		
		 int jog1 = Integer.parseInt(JOptionPane.showInputDialog("Jogador 1, digite um número: "));
		 int jog2 = 0;
		 int cont=0;		
			
		  while (jog2 != jog1) {
			jog2 = Integer.parseInt(JOptionPane.showInputDialog("Acerte o número do jogador 1: "));
			if (jog1>jog2) {
				System.out.println("Você está chutando um valor baixo!");
				cont=cont+1;
			} else if (jog1<jog2) {
				System.out.println("Você está chutando um valor alto!");
				cont=cont+1;
		    } else {
		    	System.out.println("Parabéns! Você acertou!!");
		    	System.out.println("Tentativas: " + (cont+1));
		    }
		    	
	     }
	*/ 
		    
		// Outra forma:
		  
	  int num = Integer.parseInt(JOptionPane.showInputDialog("Número 1: "));
	  int chute = 0;
	  int cont = 0;	
		  
		  do{
		 	chute=Integer.parseInt(JOptionPane.showInputDialog("Acerte o número: "));
		 	cont=cont+1;
		 	if (chute>num) {
		 		System.out.println("Está chutando alto!");
		 	}else if (chute<num) {
		 		System.out.println("Você está chutando um valor baixo!");
		 	} 
		    	
		 } while (chute != num);	
		 			
		 	System.out.println("Parabéns! Você acertou com " + cont + " tentativa(s)");
				
		
		
	}
}
