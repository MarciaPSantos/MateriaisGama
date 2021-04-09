package decisao;

import javax.swing.JOptionPane;

public class DecisaoComposta {
	
	public static void main(String[] args) {
		
		/*Capturar:
		 * - nome da disciplina
		 * - nota1
		 * - nota2
		 * Exibir média
		 * Exibir parabéns somente se a média for maior ou igual a 6
		 * Exibir nota menor que 4 = reprovado
		 */
	
		String disciplina = JOptionPane.showInputDialog("Digite o nome da matéria: ").toUpperCase();
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));
		
		System.out.println("Média: " + ((nota1 + nota2)/2));
		
		if (((nota1 + nota2)/2)>=6) {
			System.out.println("Parabéns!! Você foi aprovado na disciplina: " + disciplina);
		} else if (((nota1 + nota2)/2)<4) {
			System.out.println("Infelizmente você foi reprovado na disciplina: " + disciplina);
		} else {
			System.out.println("Você está de exame na disciplina: " + disciplina);
		}
		
		
		
	}

}
