package br.com.colecoes.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteList {
	
	public static void main(String[] args) {
	
		/*Collection Framework: classes voltadas para manipulacao
		 * de um conjunto de dados. Mais flexíveis que os vetores
		 * Principais aspectos:
		 * 	- sua alocação é dinâmica
		 * 	- dados podem ser heterogêneos ou homogêneos (generics <>)
		 * 	- não precisa da variável pra controlar o índice
		 *  - podemos remover uma posição
		 */
		
		/*Vetor
		 * int[] numeros = new int[3];
		 * int indice=0;
		 * numeros[indice] = 500;
		 * indice++;
		 * numeros[indice] = 700;
		 */
	
		// na hora de importar é a opção java util
		//Array é uma filha do List
		// tipo do dado entre <> só permite lista homogênea
		//é possível ter uma lista de um Objeto
		List <String> lista = new ArrayList<String>();
		
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("DEV");
		lista.add("DBA");
		lista.add("ANALISTA");
		
		System.out.println("Lista original: " + lista);
		
		System.out.println("Segundo elemento: " + lista.get(1));
		
		lista.remove(3); //posição inicial é o zero!
		System.out.println("Lista sem o 4º elemento " + lista);
		
		Collections.sort(lista);
		System.out.println("Lista Ordenada crescente: " + lista);
		
		Collections.reverse(lista);
		System.out.println("Lista Ordenada decrescente: " + lista);
		
		// mostra todos os cargos com nome cargo na frente e não tudo numa linha só
		for (int contador=0;contador<lista.size();contador++){
			System.out.println("Cargo " + (contador+1) + " - " + lista.get(contador));
		}
		
	}
}
