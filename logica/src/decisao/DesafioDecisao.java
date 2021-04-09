package decisao;

import javax.swing.JOptionPane;

public class DesafioDecisao {

	public static void main(String[] args) {
		
		//Exercício 4: Escreva um código que leia três valores inteiros e diferentes e mostre-os em ordem decrescente
		 		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor 1: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor 2: "));
		
			if (valor2 != valor1) {
				int valor3 = Integer.parseInt(JOptionPane.showInputDialog("Valor 3: "));
				if ((valor3 != valor1) && (valor3 != valor2)){
				
				if (valor1 > valor2) {
					if(valor2 > valor3) {
						System.out.println(valor1);
						System.out.println(valor2);
						System.out.println(valor3);		
					}else {
						System.out.println(valor1);
						System.out.println(valor3);
						System.out.println(valor2);
					}
					
				} else if (valor2 > valor3) {
					if(valor1 > valor3) {
						System.out.println(valor2);
						System.out.println(valor1);
						System.out.println(valor3);	
						
					} else {
						System.out.println(valor2);
						System.out.println(valor3);
						System.out.println(valor1);
						
					}
				} else if(valor2 > valor1) {
						System.out.println(valor3);
						System.out.println(valor2);
						System.out.println(valor1);
						
					} else {
						System.out.println(valor3);
						System.out.println(valor1);
						System.out.println(valor2);
					}
					
				}else {
					System.out.println("Os números não podem ser iguais!");
			}
				
				
			} else {
				System.out.println("Os números não podem ser iguais!");
							
			}			
				
				
			
			
	}
}
