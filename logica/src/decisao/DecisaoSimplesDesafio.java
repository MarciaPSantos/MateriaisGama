package decisao;

import javax.swing.JOptionPane;

public class DecisaoSimplesDesafio {

	public static void main(String[] args) {
		
		/* Capturar o nome da pessoa
		 * Capturar Idade
		 * Exibir as mensagens de acordo com a regra
		 * - voto obrigatório: entre 18 e 70 anos
		 * - voto facultativo: 16, 17 e acima de 70
		 * - não pode votar: menores que 16 anos
		 * 
		 */
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("digite sua idade: "));
			
		if (idade>=18 && idade<70) {
			System.out.println(nome + " seu voto é obrigatório");
		}
		
		if (idade==16 || idade==17 || idade>=70) {
			System.out.println(nome + " seu voto é facultativo");
		}
		
		if (idade<16) {
			System.out.println(nome + " vocâ ainda não pode votar");
		}
	}
}
