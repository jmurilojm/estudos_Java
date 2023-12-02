package fundamentos;

public class ConvStringNumero {
	
	public static void main(String[] args) {
		
		String v1 = "7.8";
  String v2 = "8.3";
  
  System.out.println(v1 + v2);
  
  double n1 = Double.parseDouble(v1);
  double n2 = Double.parseDouble(v2);
  
  double soma = n1 + n2;
  System.out.println(soma);
  System.out.println(n1 + n2);
		
	}
}