package tela;

import classes.Conta;

public class Banco {
	public static void main(String[] args) {
		
		Conta c1 = new Conta();
		
		c1.nome = "Muri";
		c1.numero = 2887;
		
		System.out.println(c1.nome);
		
	}
}