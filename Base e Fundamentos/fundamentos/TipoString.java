package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		
		String nome = "JMurilo";
  int idade = 34;
  float altura = 1.67f;
  float peso = 83.5f;
  
  System.out.println("JMurilo".charAt(1));
  System.out.println("Bom dia!".startsWith("Bom"));
  System.out.println(nome.equals("jmurilo"));
  System.out.println(nome.equalsIgnoreCase("jmurilo"));
  System.out.printf("Meu nome é %s ,tenho %d anos e %.2f de altura, com %.2f de peso.",nome,idade,altura,peso);
		
	}
}