package ooEstudos.composicaoTemUm;

import ooEstudos.composicaoTemUm.Carro;
import ooEstudos.composicaoTemUm.Motor;


public class CarroMain {

  public static void main(String[] args) {
  
  
  Carro c1 = new Carro();
  Motor v12 = new Motor();
  
  c1.modelo = "Ferrari";
  c1.cor = "Vermelha";
  c1.ano = 2021;
  
  v12.tipo = "V12";
  v12.potencia = 650;
  
  c1.motor = v12;//Add Motor criado


//System.out.println(c1.modelo);
//System.out.println(c1.motor.tipo);
//System.out.println(c1.motor.potencia);

c1.dados();





  }

}
