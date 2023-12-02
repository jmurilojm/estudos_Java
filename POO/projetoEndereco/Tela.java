package ooEstudos.projetoEndereco;

import ooEstudos.projetoEndereco.Endereco;
import ooEstudos.projetoEndereco.Pessoa;


public class Tela {

  public static void main(String[] args) {


Pessoa p1 = new Pessoa();
Endereco e1 = new Endereco();


p1.setNome("Murilo");
p1.setEndereco(e1);

e1.setCidade("Monteiro");
e1.setUf("PB");


System.out.println(p1.infor());





  }

}
