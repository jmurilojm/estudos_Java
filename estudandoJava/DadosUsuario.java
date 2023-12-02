import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite numero: ");
		int teste = teclado.nextInt();
		
		System.out.println("O numero digitado foi: "+teste);
    
	}
}