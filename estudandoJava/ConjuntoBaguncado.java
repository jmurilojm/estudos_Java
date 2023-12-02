package colecoes;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoBaguncado {

  public static void main(String[] args) {
	
	HashSet conjunto = new HashSet();
	
	conjunto.add("Murilo"); //Conversao automática! Exemplo:
	conjunto.add('M'); // char para Character
	conjunto.add(2.0);
	conjunto.add(87);
	conjunto.add(true);
	
	// .size() Tamanho
	// .add() Adicionar
	// .remove() Remover - Retorna true ou false
	// .contains() Contem?
	
	System.out.println(conjunto.size());//5
	
	conjunto.add("murilo");//Diferente! Soma!
	
	System.out.println(conjunto.size());//6
	
	conjunto.add(87);//Igual! e ja existe! Nao Soma!
	
	System.out.println(conjunto.size());//6
	
	//conjunto.remove("murilo");
	System.out.println(conjunto.remove("murilo"));//True - Removido
	
	System.out.println(conjunto.size());//5
	
	System.out.println(conjunto.contains("Murilo"));//True - Contem
	System.out.println(conjunto.contains("murilo"));//False - Nao Contem
	
//Mostra os elementos do conjunto
	System.out.println(conjunto);
	
	
	
//UNIAO DE CONJUNTOS
	Set numeros = new HashSet();
	
	numeros.add(87);
	numeros.add(5);
	numeros.add(2021);
	
	conjunto.addAll(numeros);
	System.out.println(conjunto);
	
	
	
	
	
	
	
	
	

  }

}
