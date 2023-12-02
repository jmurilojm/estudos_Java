package controles;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int s = 0;
	
	do {System.out.println("Ola!");
		System.out.print("Senha: ");
		s = teclado.nextInt();
	}
	while (s != 123);
	
	System.out.println("Senha Correta!");
	
	teclado.close();
	
	}
}