package ooEstudos;

import ooEstudos.Cachorro;


public class CachorroMain {

  public static void main(String[] args) {
  
  	Cachorro c1 = new Cachorro();
  	
  	c1.raca = "Pit Bull";
  	c1.tamanho = 5;
  	c1.peso = 25.3;
  	c1.latir();
  	
  	
  	Cachorro c2 = new Cachorro();
  	
  	c2.raca = "Poodle";
  	c2.tamanho = 1;
  	c2.peso = 2.5;
  	c2.latir();
  	
   
  }
}
