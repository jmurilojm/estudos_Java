package projetoContas;

public class Conta {

private String titular;
private int numero;
private double saldo;
static int contasAbertas = 0;

public Conta(String titular){
  
	this.titular = titular;
	contasAbertas++;
	numero = contasAbertas;
	this.saldo = 0;
  
}

public void dadosBancarios(){
	System.out.println("Titular: "+this.titular);
	System.out.println("Conta: "+this.numero);
	System.out.println("Saldo: "+this.saldo+"\n");
}
public void totalContas(){
	System.out.println("Total de Contas abertas: "+contasAbertas+"\n");
}
public void depositar(double valor){
	this.saldo += valor;
	System.out.println("Deposito realizado.\n");
	//this.dadosBancarios();
}
public void sacar(double valor){
	if(valor <= this.saldo){
		this.saldo -= valor;
		System.out.println("Saque realizado.\n");
		//this.dadosBancarios();
	}else{
		System.out.println("Saldo Insuficiente!\n");
	}
}
public void saldo(){
	System.out.println("Saldo: "+this.saldo+"\n");
}






}
