package ooEstudos.calculadora;

import ooEstudos.calculadora.Matematica;


public class MatematicaMain {

  public static void main(String[] args) {
  
  Matematica calc = new Matematica();
  
  int a = calc.maior(8,3);
  System.out.println("Maior: "+a);
  
  int b = calc.soma("String junto com Int.\nObs:tem que terminar com o argumentos do mesmo tipo do método!",4,6,5);
  System.out.println("Soma de n numeros: "+b);
  
  int num = 961;
  int c = calc.raiz(num);
  System.out.println("Raiz de "+num+": "+c);
  System.out.println("Raiz de "+num+": "+Math.sqrt(27));
  
  /*
  //Calc. Raiz - Equacao de Pell's

  int num = 27;
  int cont = 0;
  for(int x = 0;x<num;x+=2){
    num -= x;
    cont += 1;
  }
  System.out.println(cont);
  */

  }

}
