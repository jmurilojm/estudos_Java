package ooEstudos.projetoEndereco;

public class Pessoa {


private String nome;
private Endereco endereco;


public void setNome(String x){
  this.nome = x;
}
public String getNome(){
  return nome;
}
public void setEndereco(Endereco x){
  this.endereco = x;
}
public Endereco getEndereco(){
  return endereco;
}


public String infor(){
  return "Nome: "+nome+
  "\n"+endereco.inforEnd();
}





}
