package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.List;

import br.com.colecoes.beans.Cargo;
//import br.com.colecoes.beans.CargoReduzido;

public class TesteListObjeto {

	public static void main(String[] args) {
		
		List<Cargo> lista = new ArrayList<Cargo>();
		
		lista.add(new Cargo("DBA","JR",5000));
		lista.add(new Cargo("ESTAGIARIO","PL",3000));
		lista.add(new Cargo("DEV","SR",15000));
		lista.add(new Cargo("DBA","SR",15500));
		lista.add(new Cargo("ANALISTA","JR",5500));
		
		System.out.println("Lista original: " + lista);
		
	//	for (int contador=0;contador<lista.size();contador++){
	//		System.out.println("Objeto " + (contador+1));
	//		System.out.println("Cargo: " + lista.get(contador).getNome());
	//		System.out.println("Nível: " + lista.get(contador).getNivel());
	//		System.out.println("Salário: " + lista.get(contador).getSalario());
	//	}
		
		/* - Exibir o total de todos os salários
		 * - Exibir a média
		 * - Exibir quantos cargos nível junior
		 */
				
		float total=0;
		float media=0;
		float qtdJunior=0;
		
//		Lista<CargoReduzido> resultado = new ArrayList<CargoReduzido>();
		for (int contador=0;contador<lista.size();contador++){
		total=total + lista.get(contador).getSalario();
		media=total/(contador+1);
			// usar equals ao invés de ==true
			if(lista.get(contador).getNivel().equals("JR")) {
				qtdJunior=qtdJunior+1;
	//			resultado= !!olhar como foi feito!!
				}
		}
		System.out.println("Total de todos os salários: " + total);
		
		System.out.println("Média de salários: " + media);
		// outra forma de média
		System.out.println("Média_2: " + total/lista.size());
		
		System.out.println("Quantidade de juniors: " + qtdJunior);
		
	}
}
