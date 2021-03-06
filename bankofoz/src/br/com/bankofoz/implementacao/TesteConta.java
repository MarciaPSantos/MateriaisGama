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
		
		//cria na classe pai para poder instanciar nas classes filhas. Sen?o n?o conseguiria fazer isso
		Conta conta = new Conta();
		if (Magica.b("Abrir conta corrente?")==true){
			conta = new Corrente(
					(short) Magica.i("N?mero"), //faz um cast (short) pq n?o tem o m?todo no Magica
					(byte) Magica.i("D?gito"),
					(short) Magica.i("Ag?ncia"),
					Magica.f("Saldo"),
					cliente,                   //puxa as infos de cliente que est?o acima
					Magica.f("Limite"),
					Magica.f("Taxa")
					);
		}else{
			conta = new Poupanca(
					(short) Magica.i("N?mero"),
					(byte) Magica.i("D?gito"),
					(short) Magica.i("Ag?ncia"),
					Magica.f("Saldo"),
					cliente,
					Magica.f("Rendimento")
					);
		}
		
		//n?o precisa colocar para mostrar o toString da conta, pq j? ? algo "padr?o"	
		System.out.println(conta);
			
		//executar o sacar que est? na classe conta -> pq a poup?a n?o tem esse m?todo. Se fosse corrente, ele tbm tem e esse que ? executado
		System.out.println(conta.sacar(1000));       //se n?o colocar o sysout, ele n?o da msgm nenhuma, apenas executa o m?todo (true or false)
		System.out.println("Ap?s sacar: " + conta.verificarSaldo());
		System.out.println(conta.depositar(1550)); 
		System.out.println("Ap?s depositar: " + conta.verificarSaldo());
				
		//segunda linha faz um Cast pq o m?todo s? est? na filha!
		// para fazer sem utilizar o instanceof, tem que criar um m?todo vazio na classe pai! ela vai chamar o m?todo espec?fico da subclasse
		//if (conta instanceof Corrente) {
		//	((Corrente) conta).aumentarLimite(15);
		//	System.out.println("Limite: " + ((Corrente) conta).getLimite());
		//}else if (conta instanceof Poupanca){
		//	((Poupanca) conta).creditarRendimento();
		//	System.out.println("Saldo ap?s creditar rendimento: " + conta.verificarSaldo());
		//}
		
		conta.creditarRendimento();
		System.out.println("Ap?s creditar rendimento: " + conta.verificarSaldo());

	}		

}
