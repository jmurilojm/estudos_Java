package projetoEscola;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Pessoa {

	private String formacaoAcademica;
	private double salario;
 
	private final List<Disciplina> disciplinas;
	private final List<Turma> turmas;
 
 
	//METODOS
	//Construtor
	public Professor(){
		this.disciplinas = new ArrayList<>();
		this.turmas = new ArrayList<>();
	}
 
	//Acoes
	void aplicarAvaliacao(){
 
	}
 
	//Manipelando Lista das Disciplinas
	public void adinionarDisciplina(Disciplina disciplina){
		this.disciplinas.add(disciplina);
	}
	public void removerDisciplina(Disciplina disciplina){
		this.disciplinas.remove(disciplina);
	}
	public int totalDisciplinas(){
		return this.disciplinas.size();
	}
 
	//Manipulando Lista das Turmas
	public void adicionarTurma(Turma turma){
		this.turmas.add(turma);
	}
	public void removerTurma(Turma turma){
		this.turmas.remove(turma);
	}
	public int totalTurmas(){
		return this.turmas.size();
	}
 
	//Informacoes da turma
	public void inforProfessor(){
		System.out.println("===== INFORMAÇÕES DO PROFESSOR =====");
		System.out.println("Professor: "+this.getNome());
		System.out.println("Matrícula: "+this.getMatricula());
		System.out.println("Formação: "+this.formacaoAcademica);
		System.out.println("Salário: "+this.salario);
		System.out.println();
	}
 
 
	//GET SET
	public String getFormacaoAcademica() {
		return this.formacaoAcademica;
	}
	public void setFormacaoAcademica(String formacaoAcademica) {
		this.formacaoAcademica = formacaoAcademica;
	}
	public double getSalario() {
		return this.salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}


}
