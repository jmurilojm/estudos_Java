package ooEstudos.bancoGuanabara;

import ooEstudos.bancoGuanabara.ContaBanco;


public class ContaBancoMain {

  public static void main(String[] args) {
  
  ContaBanco c1 = new ContaBanco();
  
  c1.abrirConta();
  c1.depositar(1000);
  c1.getSaldo();
  c1.fecharConta();
  c1.sacar(1500);
  c1.getSaldo();
  c1.sacar(56);
  c1.getSaldo();
  c1.sacar(55);
  c1.getSaldo();
  c1.fecharConta();
  c1.dados();

  }

}
