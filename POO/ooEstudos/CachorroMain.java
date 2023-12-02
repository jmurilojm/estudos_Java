package ooEstudos;

import ooEstudos.Cachorro;


public class CachorroMain {

  public static void main(String[] args) {

	Cachorro pitbul = new Cachorro();
	
	pitbul.tamanho = 3;
	pitbul.raca = "Pitbull";
	
	Cachorro viralata = new Cachorro();
	
	viralata.tamanho = 5;
	viralata.raca = "Vira-lata";
	
	pitbul.latir();
	
	//System.out.println(pitbul.latir());
	
	
	
  }

}
