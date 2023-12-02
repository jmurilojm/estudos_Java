package ooEstudos.funcionario;

import ooEstudos.funcionario.Funcionario;


public class FuncionarioMain {

  public static void main(String[] args) {
  
  
  Funcionario f1 = new Funcionario();
  Funcionario f2 = new Funcionario();
  
  
  f1.setNome("Jose Murilo");
  f1.setIdade(34);
  f1.setCasado("sim");
  
  f2.setNome("Jéssica Poliana");
  f2.setIdade(30);
  f2.setCasado("sim");
  
  
  
  
  
  System.out.println(">>> TOTAL DE CADASTROS: "+Funcionario.totalFuncionarios+"\n");
  f1.dados();
  f2.dados();
  
  
  
  

  }

}
