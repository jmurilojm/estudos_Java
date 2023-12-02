package ooEstudos.heranca;

import ooEstudos.heranca.Cachorro;


public class AnimalMain {

  public static void main(String[] args) {
  
  Cachorro c1 = new Cachorro();
  
  c1.comida = "carne";
  c1.peso = 5;
  
  
  System.out.println(c1.comida);
  System.out.println(c1.peso);
  c1.dormir();
  c1.acordar();
  
  

  }

}
