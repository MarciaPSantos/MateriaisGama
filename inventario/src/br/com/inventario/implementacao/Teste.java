package br.com.inventario.implementacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.inventario.beans.Servidor;
import br.com.inventario.beans.Software;

public class Teste {

	public static void main(String[] args) {
		
		List<Software> lista = new ArrayList<Software>();
		
		Servidor servidor = new Servidor(
				"SERV01",
				"XPTO DESC",
				lista
				);
		
		do {
			lista.add(new Software(
					JOptionPane.showInputDialog("Nome"),
					JOptionPane.showInputDialog("Função"),
					Float.parseFloat(JOptionPane.showInputDialog("Valor")),
					Byte.parseByte(JOptionPane.showInputDialog("Licenças"))
					));
		} while(JOptionPane.showConfirmDialog(null, "Deseja continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0);
		
		int qtdeSO=0;
		String nomes = "";
		
		for (int contador=0;contador<servidor.getSoftwares().size();contador++) {
			System.out.println("Total do Software: " + (servidor.getSoftwares().get(contador).getValor() * servidor.getSoftwares().get(contador).getLicencas()) + "(" + servidor.getSoftwares().get(contador).getNome() + ")" );
					
		if (servidor.getSoftwares().get(contador).getFuncao().equals("SO")) {
			qtdeSO++;
		}
		
		if (servidor.getSoftwares().get(contador).getLicencas()==1){
			nomes+=servidor.getSoftwares().get(contador).getNome() + "\n";
					
		}
			
		System.out.println("Softwares com uma licença: " + nomes);
		System.out.println("Total de SO´s: " + qtdeSO);	
		
		}
				
				
				
				
		
		
		
				
				
		
	}
	
}
