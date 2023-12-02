package projetoEscola;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String sigla;
	private int ano;
 
	private final List<Aluno> alunos;
	private final List<Professor> professores;
	private final List<Disciplina> disciplinas;
 
 
	//METODOS
	//Construtor
	public Turma(){
		this.alunos = new ArrayList<>();
		this.professores = new ArrayList<>();
		this.disciplinas = new ArrayList<>();
	}
 
	//Acoes
 
	//Manipulando Lista de Alunos
	public void adicionarAluno(Aluno aluno){
		this.alunos.add(aluno);
	}
	public void removerAluno(Aluno aluno){
		this.alunos.remove(aluno);
	}
	public int totalAlunos(){
		return alunos.size();
	}
	public Aluno getAluno(int posicao){
		return this.alunos.get(posicao);
	}
	public void nomeAlunos(){
		for(int x = 0; x < this.totalAlunos(); x++){
			System.out.println((x+1)+"- "+this.getAluno(x).getNome());
		}
	}
 
	//Manipulando Lista de Professores
	public void adionarProfessor(Professor professor){
		this.professores.add(professor);
	}
	public void removerProfessor(Professor professor){
		this.professores.remove(professor);
	}
	public int totalProfessores(){
		return this.professores.size();
	}
 
	//Manipulando Lista de Disciplinas
	public void adionarDisciplina(Disciplina disciplina){
		this.disciplinas.add(disciplina);
	}
	public void removerDisciplina(Disciplina disciplina){
		this.disciplinas.remove(disciplina);
	}
	public int totalDisciplinas(){
		return this.disciplinas.size();
	}
 
 
	//Informacoes da turma
	public void inforTurma(){
		System.out.print(this.ano);
		System.out.print("º"+this.sigla);
		System.out.println("\nTotal de Alunos: "+this.totalAlunos()+" alunos");
		System.out.println("Total de Disciplinas: "+this.totalDisciplinas());
		System.out.println("Total de Professores: "+this.totalProfessores());
		System.out.println();
	}
 
 
	//GET SET
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}


}
