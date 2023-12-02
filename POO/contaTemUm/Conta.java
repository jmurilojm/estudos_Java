package ooEstudos.contaTemUm;

public class Conta {

String banco;
double saldo;
Pessoa cliente;


double saque(double valor){
if(saldo < valor){
  System.out.println("Saldo Insuficiente!");
  System.out.println("Limite disponível: "+saldo+"\n");
  return saldo;
}else{
  System.out.println("Saque Realizado com Sucesso!");
  System.out.println("     -"+valor+" D\n");
  return this.saldo -= valor;
}
}

double deposito(double valor){
  return this.saldo += valor;
}

void saldo(){
  System.out.println(banco);
  System.out.println(cliente.nome);
  System.out.println(cliente.endereco);
  System.out.println(cliente.contato);
  System.out.println(saldo+"\n");
}



}
