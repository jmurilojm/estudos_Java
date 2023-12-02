package projetoEscola;

import java.util.Date;

public class Aluno extends Pessoa {

	private Date dataNascimento;
	private Turma turma;
 
 
	//METODOS
	//Acoes
	void realizarAvaliacao(){
 
	}
 
	//Informacoes da turma
	public void inforAluno(){
		System.out.println("====== INFORMAÇÕES DO ALUNO =====");
		System.out.println("Aluno: "+this.getNome());
		System.out.println("Matrícula: "+this.getMatricula());
		System.out.println(this.dataNascimento);
		System.out.print(this.turma.getAno());
		System.out.println("º"+this.turma.getSigla());
		System.out.println();
	}
 
	//GET SET
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Turma getTurma() {
		return turma;
	}
	public void setTurma(Turma turma) {
		this.turma = turma;
	}


}
