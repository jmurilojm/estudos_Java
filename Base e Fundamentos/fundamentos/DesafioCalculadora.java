package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
  
  
  System.out.print("Digite numero: ");
  double n1 = teclado.nextDouble();
  
  System.out.print("Digite numero: ");
  double n2 = teclado.nextDouble();
  
  System.out.print("\nInforme a operacao: ");
  String op = teclado.next();
  
  //Logica
	double resultado = "+".equals(op)?n1+n2 : 0;
	resultado = "-".equals(op)?n1-n2 : resultado;
	resultado = "*".equals(op)?n1*n2 : resultado;
	resultado = "/".equals(op)?n1/n2 : resultado;
	resultado = "%".equals(op)?n1%n2 : resultado;
  
  System.out.printf("%.1f %s %.1f = %.1f",n1,op,n2,resultado);
  
  
  teclado.close();
		
	}
}