package projetoEscola.tela;

import java.util.Date;
import projetoEscola.Aluno;
import projetoEscola.Disciplina;
import projetoEscola.Professor;
import projetoEscola.Turma;

public class Escola {

  public static void main(String[] args) {
  
	//INSTANCIAS
	Disciplina d1 = new Disciplina();
	Disciplina d2 = new Disciplina();
	Professor p1 = new Professor();
	Turma t1 = new Turma();
	Aluno a1 = new Aluno();
	Aluno a2 = new Aluno();
  
	//DISCIPLINAS
	d1.setNome("Matemática");
	d1.setCargaHoraria(854);
	d1.adicionaTurma(t1);
	d1.adicionarProfessor(p1);
  
	d2.setNome("Portugues");
	d2.setCargaHoraria(1200);
	d2.adicionaTurma(t1);
  
	//PROFESSORES
	p1.setNome("Doglas Henrique");
	p1.setFormacaoAcademica("Licenciatura em Matemática");
	p1.setMatricula(202011);
	p1.setSalario(3_500);
  
	//TURMAS
	t1.setAno(9);
	t1.setSigla("A");
	t1.adionarDisciplina(d1);
	t1.adionarDisciplina(d2);
	t1.adicionarAluno(a1);
	t1.adicionarAluno(a2);
	t1.adionarProfessor(p1);
  
	//ALUNOS
	a1.setNome("José Murilo");
	a1.setMatricula(73_770);
	a1.setDataNascimento(new Date());
	a1.setTurma(t1);
  
	a2.setNome("Jéssica Poliana");
	a2.setMatricula(92_790);
	a2.setDataNascimento(new Date());
	a2.setTurma(t1);
  
	//EXECUÇÕES EM TELA
	a1.inforAluno();
	a2.inforAluno();
	p1.inforProfessor();
	t1.inforTurma();
	d1.inforDisciplina();
	t1.nomeAlunos();
 
 
 
 }
 
}
