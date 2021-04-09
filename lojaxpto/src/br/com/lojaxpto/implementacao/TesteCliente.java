package br.com.lojaxpto.implementacao;

import javax.swing.JOptionPane;

import br.com.lojaxpto.modelo.Cliente;
import br.com.lojaxpto.modelo.PessoaFisica;
import br.com.lojaxpto.modelo.PessoaJuridica;

public class TesteCliente {

public static void main(String[] args) {
	
	//criei pela sub e instanciei pela sub
	//PessoaFisica pf = new PessoaFisica();
	
	//criei pela super e instanciei pela sub
	//Cliente cli = new PessoaFisica();
	
	Cliente cliente = new Cliente();
	
		if (JOptionPane.showInputDialog
		("Digite <F> para fisica ou qqer letra para Juridica").toUpperCase().equals("F")) {
			
			cliente = new PessoaFisica(
					"NOME PF",
					"EMAIL@PF.COM.BR",
					"12345678900",
					"1149146-X"					
					);
		}else {
			cliente = new PessoaJuridica(
					"NOME PJ",
					"EMAIL@PJ.COM.BR",
					"112223334444/55",
					"CONTATO",
					"123.12.123"
					);
			
		}
		
		// linha age de acordo com o que foi instanciado. Se não encontrar Pf e nem PJ, mostra Cliente
		System.out.println(cliente.toString());
	
		//chamar getDocumentos somente se for pessoa física
		//criar um método na super classe - pq criamos no cliente (new cliente)
		System.out.println(cliente.getDocumentos());
		
}


}
