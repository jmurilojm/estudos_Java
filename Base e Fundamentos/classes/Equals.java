package exercicios.classes;

import exercicios.classes.Usuario;


public class EqualsHashcode {

  public static void main(String[] args) {
  
  	Usuario p1 = new Usuario();
  	p1.nome = "Murilo";
  	p1.mail = "@gmail";
  	
  	Usuario p2 = new Usuario();
  	p2.nome = "Murilo";
  	p2.mail = "@gmail";
  	
  	System.out.println(p1==p2);//false - Ender diferentes
  	System.out.println(p1==p1);//true - Ender iguais
  	
  	System.out.println(p1.equals(p2));//false - Ender dif
  	System.out.println(p1.equals(p1));//true - Ender iguais
  	
  	
  }

}
