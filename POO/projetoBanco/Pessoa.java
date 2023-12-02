package projetoBanco;

public class Pessoa {


private String nome;
private int idade;
private Conta conta;


public void setNome(String nome){
  this.nome = nome;
}
public String getNome(){
  return nome;
}
public void setIdade(int idade){
  this.idade = idade;
}
public int getIdade(){
  return idade;
}
public void setConta(Conta conta){
  this.conta = conta;
}


public void inforPessoa(){
  System.out.println("Banco: "+conta.getNomeBanco());
  System.out.println("Agência: "+conta.getNumeroBanco());
  System.out.println("Titular: "+nome);
  System.out.println("Idade: "+idade);
  System.out.println("Conta: "+conta.getNumero());
  System.out.println("Saldo: "+conta.getSaldo());
}






}
