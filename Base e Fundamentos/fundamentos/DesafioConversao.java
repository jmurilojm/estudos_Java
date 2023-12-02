package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
  
  System.out.print("Digite salario 1 :");
  String s1 = teclado.next().replace(",",".");
  
  System.out.print("Digite salario 2 :");
  String s2 = teclado.next().replace(",",".");
  
  System.out.print("Digite salario 3 :");
  String s3 = teclado.next().replace(",",".");
  
  double v1 = Double.parseDouble(s1);
  double v2 = Double.parseDouble(s2);
  double v3 = Double.parseDouble(s3);
  
  
  double media = (v1 + v2 + v3) / 3;
  System.out.println(media);
  
  
  teclado.close();
		
	}
}