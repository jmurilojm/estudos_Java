package ooEstudos.banco;

import ooEstudos.banco.Conta;


public class ContaMain {

  public static void main(String[] args) {
  
  System.out.println("==============================================");
  System.out.println("              ABERTURA DE CONTA"); System.out.println("==============================================");
  
  Conta c1 = new Conta();
  c1.cliente = "Murilo";
  c1.banco = "Caixa";
  c1.saldo = 1500.;
  c1.saldo();
  
  Conta c2 = new Conta();
  c2.cliente = "Jessica";
  c2.banco = "Banco do Brasil";
  c2.saldo = 3000.;
  c2.saldo();
  
   System.out.println("==============================================");
   System.out.println("               SALDO ATUALIZADO");
   System.out.println("==============================================");
  
  //Movimentacoes

  c1.sacar(50);
  c1.depositar(5_000.00);
  c1.transferir(c2,450);
  c2.sacar(450);
  c1.transferir(c2,15);//Criei
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  //Mostrar Saldos atualizados
  c1.saldo();
  c2.saldo();

  }

}
