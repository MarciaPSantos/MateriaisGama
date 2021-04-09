package br.com.gama.implementacao;

import javax.swing.JOptionPane;

import br.com.gama.modelo.Aluno;
import br.com.gama.modelo.Curso;
import br.com.gama.modelo.Endereco;
import br.com.gama.modelo.Professor;
import br.com.gama.modelo.Turma;

public class TesteTurma {

	public static void main(String[] args) {
		
		//FAZER COM E SEM O CONSTRUTOR CHEIO
		//FAZER METODOS ESTATICOS
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("AVENIDA ITAQUERA");
		endereco.setNumero("358A-FUNDOS");
		endereco.setComplemento("Viela 321");
		endereco.setBairro("ITAQUERA");
		endereco.setCidade("SÃO PAULO");
		endereco.setUf("SP");
		endereco.setCep("12345-123");
				
		Aluno aluno = new Aluno();
		aluno.setEndereco(endereco); //atributo que faz referencia à uma classe
		aluno.setEmail(JOptionPane.showInputDialog("Email: ").toLowerCase());
		aluno.setFone(JOptionPane.showInputDialog("Fone: "));
		aluno.setNome(JOptionPane.showInputDialog("Nome: "));
		aluno.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Matricula :")));
		
		Professor professor = new Professor();
		professor.setNome(JOptionPane.showInputDialog("Nome professor: "));
		professor.setFormacao(JOptionPane.showInputDialog("Formacao: "));
		professor.setArea(JOptionPane.showInputDialog("Area: "));
		professor.setEndereco(endereco);
		
		Curso curso = new Curso();
		curso.setSigla(JOptionPane.showInputDialog("Sigla curso: "));
		curso.setDescricao("CURSO DE JAVA");
		curso.setAtivo(false);
		curso.setValor((float)50);
		curso.setDuracao((byte)2);
		
		Turma turma = new Turma();
		turma.setSigla(JOptionPane.showInputDialog("Sigla turma: "));
		turma.setPeriodo(JOptionPane.showInputDialog("Periodo: "));
		turma.setCurso(curso);
		turma.setAluno(aluno);
		turma.setProfessor(professor);
		
		
		
		
		
		
		
		
	}
	
}
