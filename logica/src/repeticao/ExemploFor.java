package repeticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		
		/* while e do while é mais para o usuário final (front end)
		 * backend é mais utilizado o for -> trabalha entre o front e o banco de dados
		 */
		
		/* Sintaxe for:
		 * - contador e o valor inicial;
		 * - condição (até quando?);
		 * - como vai ocorrer o incremento (a contagem)
		 */
		
	// for(tipo variável valor inicial; condição;incremento)
	//for(int contador=0; contador<50;contador+=1) {
	//	System.out.println("contador: " + contador);
	//	}
		
		
		short tabuada = Short.parseShort(JOptionPane.showInputDialog("Tabuada: "));
		for(int cont=1;cont<11;cont+=1) {
			System.out.println(tabuada + " x " + cont + " = " + (tabuada*cont));
		}	
			
		
		
		
		
		
		
	}
}
