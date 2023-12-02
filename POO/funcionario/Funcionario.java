package ooEstudos.funcionario;

public class Funcionario {


private String nome;
private int idade;
boolean casado;
public static int totalFuncionarios;


public void setIdade(int idade){
  this.idade = idade;
}
public int getIdade(){
  return idade;
}

public void setNome(String nome){
  this.nome = nome;
  Funcionario.totalFuncionarios++;
}
public String getNome(){
  return nome;
}

public void setCasado(String casado){
  if(casado.equals("sim")){
    this.casado = true;
  }else{
    this.casado = false;
  }
}
public boolean isCasado(){
  return casado;
}


void dados(){
  System.out.println(nome);
  System.out.println(idade);
  System.out.println(casado+"\n");
}







}
