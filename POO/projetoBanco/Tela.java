package projetoBanco;

import projetoBanco.Banco;
import projetoBanco.Conta;
import projetoBanco.Pessoa;


public class Tela {

  public static void main(String[] args) {


Banco banco1 = new Banco();
Pessoa pessoa1 = new Pessoa();
Conta conta1 = new Conta();


banco1.setNome("Caixa Econômica Federal");

conta1.setBanco(banco1);
conta1.setNumero(123);
conta1.setSaldo(500);

pessoa1.setNome("Murilo");
pessoa1.setIdade(34);
pessoa1.setConta(conta1);


pessoa1.inforPessoa();


  }

}
