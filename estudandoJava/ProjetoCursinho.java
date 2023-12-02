import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		//instancias
		//sala s - Curso c - Aluno a:
		Sala s = new Sala();//3
		s.ano = 2022;
		s.sigla = "A";
		
		Curso c = new Curso();//3
		c.nome = "Direito";
		c.cargaHoraria = 80;
		
		Aluno a = new Aluno();//3
		a.nome = "Fulano de Apelido Modesto";
		a.matricula = 2887;
		
		
		//atribuicao do passo 4:
		a.addCurso(c);
		a.addSala(s);
		c.addSala(s);//4 - Um para Um
		s.addCurso(c);//4 - Um para Um
		
		s.addAluno(a);//4 - Um para Muitos
		c.addAluno(a);
		
		//mostrando alunos:
		s.listaAlunos();//da sala
		c.listaAlunos();//do curso
		
		
	}
}


class Pessoa{
    
    String nome;//1 
    
}

class Aluno extends Pessoa{
    
    int matricula;//1
    
    Curso curso;//2
    Sala sala;//2
    
    //metodos
    void addSala(Sala sala){
        this.sala = sala;
    }
    void addCurso(Curso curso){
        this.curso = curso;
    }
    
}

class Sala{
    
    String sigla;//1
    int ano;//1
    
    Curso curso;//2
    ArrayList<Aluno> alunos;//2
    
    //construtor iniciando array
    Sala(){
       alunos = new ArrayList<>();
    }
    
    //metodos
    void addCurso(Curso curso){
        this.curso = curso;
    }
    
    void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    void listaAlunos(){
        System.out.println("Sala: "+ano+" - "+sigla);
        for(Aluno listandoAlunosDaSala : this.alunos){
		    System.out.println("Aluno da Sala: "+ listandoAlunosDaSala.nome);
		}
    }
    
}

class Curso{
    
    String nome;//1
    int cargaHoraria;//1
    
    Sala sala;//2
    ArrayList<Aluno> alunos;//2
    
    //construtor iniciando array
    Curso(){
        alunos = new ArrayList<>();
    }
    
    //metodos
    void addSala(Sala sala){
        this.sala = sala;
    }
    
    void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }
    
    void listaAlunos(){
        System.out.println("Curso: "+nome);
        for(Aluno listandoAlunosDoCurso : this.alunos){
		    System.out.println("Aluno do Curso: "+listandoAlunosDoCurso.nome);
		}
    }
}

/*
> PASSO 1 - atribuir as caracteristicas de cada uma das classes, sem fazer alguma associacao entre elas.

> PASSO 2 - implementar, em cada uma das classes, os atributos que traz a co-relacao de associacao entre elas: Um para Um, Um para Muitos ou Muitos para Muitos.

> PASSO 3 - instanciar o objeto de cada uma das clases, utilizando os atributos/caracteristicas, nao associativos, ou seja, naturais, mencionados no passo 1.

> PASSO 4 - fazer as associacoes entre as classes, atraves dos atributos adcionados no passo 2.
Um para Um > com setter passa o objeto.
Um para Muitos > com setter add() a lista.
Muitos para Muitos > idem Um para Muitos.
*/