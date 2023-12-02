package projetoBanco;

public class Conta {


private int numero;
private double saldo;
private Banco banco;


public void setNumero(int numero){
  this.numero = numero;
}
public int getNumero(){
  return numero;
}

public void setSaldo(double saldo){
  this.saldo = saldo;
}
public double getSaldo(){
  return this.saldo;
}

public void setBanco(Banco banco){
  this.banco = banco;
}


public String getNomeBanco(){
  return banco.getNome();
}
public int getNumeroBanco(){
  return banco.getNumero();
}





}
