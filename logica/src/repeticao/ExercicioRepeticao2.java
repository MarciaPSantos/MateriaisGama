package repeticao;

import javax.swing.JOptionPane;

public class ExercicioRepeticao2 {
	
	public static void main(String[] args) {
		
		/* Programa que solicite o nome e idade das pessoas
		 * A aplicação continuará perguntando nome e idade enquanto o usuário afirmar que deseja continuar
		 * Ao terminar a aplicação deverá exibir:
		 *  - Qtd de pessoas >= 18 anos - ok
		 *  - Média de idades registradas - ok
		 *  - Pessoa mais velha: nome e idade
		 *  - pessoa mais jovem: nome e idade
		 */
		
		//Missão2
		
		double idade = 0;
		double cont=0;
		double cont2=0;
		double soma=0;
		double velha=0;
		String nvelha="";
		double nova=0;
		String nnova="";
		double aux=0;
		
		String continua="";
		
		do {
			String nome = JOptionPane.showInputDialog("Digite seu nome: ");
			idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade: "));
			continua=JOptionPane.showInputDialog("Digite S para continuar: ").toUpperCase();
			
			if (idade>=18) {
				cont=cont+1;
			}
			
			soma=soma+idade;
			cont2=cont2+1;		
			
			if (velha<idade) {
				velha=idade;
				nvelha=nome;
			}
					
			if (aux==0){
				nova=idade;
				nnova=nome;
				aux=1;				
			}
			
			if (nova>idade) {
				nova=idade;
				nnova=nome;
			}
				
							
		}while(continua.equals("S"));
		
		System.out.println("Número de pesoas maiores de idade: " + cont);
		System.out.println("Média de idades: " + (soma/cont2));
		System.out.println("\nIdade mais velha: " + velha);
		System.out.println("Pessoa mais velha: " + nvelha);	 
		System.out.println("\nIdade mais nova: " + nova);
		System.out.println("Pessoa mais nova: " + nnova); 
			 
	}
}
