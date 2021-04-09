package br.com.rubinhocar.teste;

import javax.swing.JOptionPane;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {

	//precisa ter o "main" pq esse aqui irei executar! o outro é apenas uma arquitetura
	public static void main(String[] args) {
		
		//Instanciando um objeto
		//importar = control+shift+O -> apareceu a linha 3
		
	//	Veiculo carro = new Veiculo();
	//	carro.montadora = "fiat"; //da erro pq esta tentando acessar a classe anterior que esta privado
		
		Veiculo carro = new Veiculo();
		
		carro.preencherMontadora(JOptionPane.showInputDialog("Montadora"));
		
		carro.preencherModelo("gol");
		
		carro.preencherValor ((float)15000.00);
		
		carro.preencherBasico(false,(short)200);
		
		System.out.println(carro.retornarTudo());
		System.out.println("Desconto: " + carro.retornarDesconto());
		
		carro.ligar();
		
		carro.acelerar((short)15);
		carro.acelerar((short)30);
		
		carro.desacelerar((short)20);
		
		System.out.println("\nDepois de acelerar:\n" + carro.retornarTudo());
		
	
	}
}
