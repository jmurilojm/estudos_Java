
import java.util.Scanner;
public class ReservaHotel {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int totalDeQuartos = 10;
		Aluguel[] quartos = new Aluguel[totalDeQuartos];
		
		System.out.print("Total de alunos: ");
		int total = input.nextInt();
		
		for(int x = 0; x < total; x++){
			System.out.print("Nome: ");
			String nome = input.next();
			System.out.print("E-mail: ");
			String email = input.next();
			System.out.print("Numeros do quarto: ");
			int numero = input.nextInt();
			
			quartos[numero] = new Aluguel(nome,email);
		}
		
		for(int x = 0; x < totalDeQuartos; x++){
			if(quartos[x] != null){
				System.out.println("No quarto " + x + ": " + quartos[x].getNome() + "; E-mail: " + quartos[x].getEmail());
			}
		}
		
		
		input.close();
	}
}

class Aluguel{
	
	private String nome;
	private String email;
	
	public Aluguel(String nome,String email){
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome(){
		return this.nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getEmail(){
		return this.email;
	}
	public void setEmail(String email){
		this.email = email;
	}
	
	public String toString(){
		return "";
	}
	
}