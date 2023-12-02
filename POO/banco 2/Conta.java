package ooEstudos.banco;

public class Conta {

String banco;
String cliente;
double saldo;


void saldo(){
  System.out.println("Instituição: "+this.banco+"\nCliente: "+this.cliente+"\nSaldo: "+this.saldo+"\n");
}

double sacar(double valor){
  return this.saldo -= valor;
}

double depositar(double valor){
  return this.saldo += valor;
}

void depositarPara(Conta destino, double valor){
  destino.depositar(valor);
}

/*
void transferir(Conta destino, double valor){
  this.sacar(valor);
  destino.depositar(valor);
}
*/

void transferir(Conta destino, double valor){
  this.sacar(valor);
  this.depositarPara(destino,valor);
}


}
