package br.com.bankofoz.implementacao;

import br.com.bankofoz.beans.Cliente;
import br.com.bankofoz.beans.Conta;
import br.com.bankofoz.beans.Corrente;
import br.com.bankofoz.beans.Poupanca;
import br.com.bankofozutil.Magica;

public class TesteConta {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente(
				Magica.i("ID"),
				Magica.s("Nome"),
				Magica.s("CPF"),
				Magica.s("Fone")
				);
		
		//cria na classe pai para poder instanciar nas classes filhas. Senão não conseguiria fazer isso
		Conta conta = new Conta();
		if (Magica.b("Abrir conta corrente?")==true){
			conta = new Corrente(
					(short) Magica.i("Número"), //faz um cast (short) pq não tem o método no Magica
					(byte) Magica.i("Dígito"),
					(short) Magica.i("Agência"),
					Magica.f("Saldo"),
					cliente,                   //puxa as infos de cliente que estão acima
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
		}else{
			conta = new Poupanca(
					(short) Magica.i("Número"),
					(byte) Magica.i("Dígito"),
					(short) Magica.i("Agência"),
					Magica.f("Saldo"),
					cliente,
					Magica.f("Rendimento")
					);
		}
		
		//não precisa colocar para mostrar o toString da conta, pq já é algo "padrão"	
		System.out.println(conta);
			
		//executar o sacar que está na classe conta -> pq a poupça não tem esse método. Se fosse corrente, ele tbm tem e esse que é executado
		System.out.println(conta.sacar(1000));       //se não colocar o sysout, ele não da msgm nenhuma, apenas executa o método (true or false)
		System.out.println("Após sacar: " + conta.verificarSaldo());
		System.out.println(conta.depositar(1550)); 
		System.out.println("Após depositar: " + conta.verificarSaldo());
				
		//segunda linha faz um Cast pq o método só está na filha!
		// para fazer sem utilizar o instanceof, tem que criar um método vazio na classe pai! ela vai chamar o método específico da subclasse
		//if (conta instanceof Corrente) {
		//	((Corrente) conta).aumentarLimite(15);
		//	System.out.println("Limite: " + ((Corrente) conta).getLimite());
		//}else if (conta instanceof Poupanca){
		//	((Poupanca) conta).creditarRendimento();
		//	System.out.println("Saldo após creditar rendimento: " + conta.verificarSaldo());
		//}
		
		conta.creditarRendimento();
		System.out.println("Após creditar rendimento: " + conta.verificarSaldo());

	}		

}
