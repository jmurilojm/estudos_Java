package projetoEscola;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {

	private String nome;
	private int cargaHoraria;
 
	private final List<Professor> professores;
	private final List<Turma> turmas;
 
 
	//METODOS
	//Construtor
	public Disciplina(){
		this.professores = new ArrayList<>();
		this.turmas = new ArrayList<>();
	}
 
	//Acoes
 
 
	//Manipulando a Lista de Professores
	public void adicionarProfessor(Professor professor){
		this.professores.add(professor);
	}
	public void removerProfessor(Professor professor){
		this.professores.remove(professor);
	}
	public int totalProfessores(){
		return this.professores.size();
	}
 
	//Manipulando a Lista de Turmas
	public void adicionaTurma(Turma turma){
		this.turmas.add(turma);
	}
	public void removerTurma(Turma turma){
		this.turmas.remove(turma);
	}
	public int totalTurmas(){
		return this.turmas.size();
	}
 
	//Informacoes da turma
	public void inforDisciplina(){
		System.out.println("Disciplina: "+this.nome);
		System.out.print("Caraga horaria: "+this.cargaHoraria);
		System.out.println("\nTotal de Professores: "+this.totalProfessores()+" professores");
		System.out.println("Total de Turmas: "+this.totalTurmas());
		System.out.println();
	}
 
	//GET SET
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
 
	public void setCargaHoraria(int cargaHoraria){
		if(cargaHoraria >= 10){
			this.cargaHoraria = cargaHoraria;
		}
	}
	public int getCargaHoraria(){
		return this.cargaHoraria;
	}


}
