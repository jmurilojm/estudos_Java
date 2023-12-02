package ooEstudos.contaTemUm;

import ooEstudos.contaTemUm.Conta;
import ooEstudos.contaTemUm.Pessoa;


public class ContaMain {

  public static void main(String[] args) {
  
  
  Pessoa p1 = new Pessoa();
  Conta c1 = new Conta();
  
  p1.nome = "Jose Murilo";
  p1.endereco = "Monteiro-PB";
  p1.contato = "(83) 9 8652-5320";
  
  c1.banco = "Banco do Brasil";
  c1.saldo = 1_500;
  c1.cliente = p1;
  
  c1.saldo();
  c1.saque(1000);
  c1.saldo();
  c1.saque(600);
  c1.saldo();
  
  
  
  
  
  
  
  
  
  
  /*
  System.out.println(c1.banco);
  System.out.println(c1.cliente.nome);
  System.out.println(c1.cliente.endereco);
  System.out.println(c1.cliente.contato);
  System.out.println(c1.saldo);
  */

  }

}
