
import java.util.Scanner;
import classes.Produto;
public class Vetores {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Quantas posicoes? ");
		int n = input.nextInt();// Total de Posicoes
		
		//double[] vetor = new double[n];
		Produto[] vetor = new Produto[n];
		
		for(int i = 0; i < n; i++){
			//System.out.printf("Nota %d: ",(i+1));
			//vetor[i] = input.nextDouble();
			System.out.print("Nome do produto: ");
			String name = input.next();
			System.out.print("Preço: R$ ");
			double price = input.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = input.nextInt();
			vetor[i] = new Produto(name,price,quantidade);
		}
		
		
		double soma = 0.0;
		for(int i = 0; i < n; i++){
			//soma += vetor[i];
			soma += vetor[i].getPrice() * vetor[i].getQuantity();
		}
		double media = soma / n;
		System.out.println("Valor médio: "+media);
		
		for(int i = 0; i < n; i++){
			System.out.println(vetor[i]);
		}
		
		
		input.close();
	}
}