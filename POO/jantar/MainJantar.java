package desafios;

public class MainJantar {
	
	public static void main(String[] args) {
		
		Comida arroz = new Comida("Arroz",0.180);
		Comida feijao = new Comida("Feijao",0.3);
		Pessoa p1 = new Pessoa("Murilo",83.);
		
		System.out.println(p1.infor());
		
		p1.comer(arroz);
		System.out.println(p1.infor());
		
		p1.comer(feijao);
		System.out.println(p1.infor());
		
	}
}