package ooEstudos.projetoEndereco;

public class Endereco {


private String cidade;
private String uf;


public void setCidade(String x){
  this.cidade = x;
}
public String getCidade(){
  return cidade;
}
public void setUf(String x){
  this.uf = x;
}
public String getUf(){
  return uf;
}


public String inforEnd(){
  return "Cidade: "+cidade+
  "\nEstado: "+uf;
}





}
