package proj005;

import classes.Estudante;

public class App {
	
	public static void main(String[] args) {
		
		Estudante e1;
		
		e1 = new Estudante();
		
		e1.name = "Estudante 2022";
		e1.nota1 = 17;
		e1.nota2 = 20;
		e1.nota3 = 15;
		
		System.out.println(e1.status());
		
	}
}