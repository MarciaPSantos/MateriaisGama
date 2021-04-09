package decisao;

import javax.swing.JOptionPane;

public class Lista2Exercicio1 {

	public static void main(String[] args) {
		
		/* Um hotel cobra R$ 80,00 a diária e mais uma taxa de serviços. 
		 * A taxa de serviços é de: 
		 * 	R$ 5,50 por diária, se o número de diárias for maior que 15; 
		 * 	R$ 6,00 por diária, se o número de diárias for igual a 15; 
		 * 	R$ 8,00 por diária, se o número de diárias for menor que 15.
		 * Monte uma aplicação que apresente a conta do cliente.
		 */
		
		short fixo = 80;
		short diarias = Short.parseShort(JOptionPane.showInputDialog("Diárias: "));
		
		if (diarias>15) {
			System.out.println("Conta cliente: " + ((fixo+5.5)*diarias));
		}else if (diarias==15) {
			System.out.println("Conta cliente: " + ((fixo+6.0)*diarias));
		}else {
			System.out.println("Conta cliente: " + ((fixo+8.0)*diarias));
		}
			
		
		/*Outra forma:
		 * boolean -> char -> byte -> short -> int -> long -> float -> double
		 * 
		 * float taxa = 8;
		 * float valor = 80;
		 * short diarias = Short.parseShort(JOptionPane.showInputDialog("Diárias: "));
		 * 
		 * if (diarias>15) {
		 * 	   taxa = (float) 5.5; -> aqui esta ocorrendo um CAST
		 * }else if (diarias==15) {
		 *	    taxa = (float) 6;  
		 * }
		 *	
		 * System.out.println("Conta cliente: " + ((valor + taxa)*diarias));
		 */
		
	}
}
