
import java.util.List;
import java.util.ArrayList;
public class Lista {
	
	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<>();
		
		nomes.add("Arroz");
		nomes.add("Feijão");
		nomes.add("Macarrão");
		nomes.add("Cuscuz");
		nomes.add("Ovos");
		nomes.add("Amendoim");
		nomes.add("Cebola");
		nomes.add("Alho");
		nomes.add("Cenoura");
		
		System.out.println("Lista: " + nomes);
		System.out.println("Total: " + nomes.size());
		
		int x = 1;
		for(String nome : nomes){
			System.out.println(x + " > " + nome);
			x++;
		}
		System.out.println("--------------------------");
		
		nomes.remove("Ovos");
		int y = 1;
		for(String nome : nomes){
			System.out.println(y + " > " + nome);
			y++;
		}
		System.out.println("--------------------------");
		
		System.out.println(nomes.contains("Amendoim"));
		System.out.println("--------------------------");
		
		System.out.println(nomes.indexOf("Amendoim"));
		
	}
}