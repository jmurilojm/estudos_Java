package controles;

import java.util.Scanner;

public class While {
	
	public static void main(String[] args) {
		
		//DETERMINADO
		
		int c = 0;
  
  while (c < 3) {
    System.out.println("JMurilo");
    c++;
  }
		
		//INDETERMINADO
		
		Scanner teclado = new Scanner(System.in);
	
	System.out.print("Senha: ");
	int senha = teclado.nextInt();
	
	while (senha != 123) {
	  System.out.println("Senha Incorreta!");
	  System.out.print("Senha: ");
	  senha = teclado.nextInt();
	}
	System.out.println("Senha Correta!");
	
	teclado.close();
	
	}
}