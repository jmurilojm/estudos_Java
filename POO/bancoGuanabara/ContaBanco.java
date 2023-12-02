package ooEstudos.bancoGuanabara;

import java.util.Scanner;


public class ContaBanco {

Scanner teclado = new Scanner(System.in);

public int numConta;
protected String tipo;
private String dono;
private double saldo;
private boolean status = false;


public void getSaldo(){
  System.out.println("Saldo > R$ "+this.saldo);
}


public boolean abrirConta(){
  System.out.print("Tipo de Conta [CC/CP]: ");
  this.tipo = teclado.next().toUpperCase();
  System.out.print("Deposito inicial: ");
  this.depositar(teclado.nextDouble());
  System.out.println("Conta Aberta com Sucesso!");
  System.out.println("Tipo: "+tipo+"\nSaldo de Abertura de Vonta > R$ "+this.saldo);
  
  return this.status = true;
}

public void fecharConta(){
  if(this.saldo != 0){
    System.out.println("Sua conta possue Saldo de R$ "+saldo+"\nPara encerra-la voce precisa realizar o saque deste valor.");
  }else{
    this.status = false;
    this.numConta = 0;
    this.tipo = null;
    this.dono = null;
    this.saldo = 0;
    System.out.println("Conta Encerrada com Sucesso!");
    System.out.println(this.status);
  }
}

public double depositar(double valor){
  return this.saldo += valor;
}

public double sacar(double valor){
  if(this.saldo < valor){
    System.out.println("Saldo Insuficiente!");
    return 0;
  }else{
    return this.saldo -= valor;
  }
}
/*
public double taxaBanco(){
  if(this.tipo.equals("CC")){
    return this.saldo -= 12;
  }else{
    return this.saldo -= 20;
  }
}
*/
public void dados(){
  System.out.println(dono);
  System.out.println(numConta);
  System.out.println(tipo);
  System.out.println(saldo);
  System.out.println(status);
}

}
