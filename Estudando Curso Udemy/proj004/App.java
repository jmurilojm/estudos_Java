package proj004;

import classes.Empregado;

public class App {
	
	public static void main(String[] args) {
		
		Empregado e1;
		
		e1 = new Empregado();
		
		e1.name = "Empregado 2022";
		e1.grossSalary = 1800.;
		e1.tax = 600.;
		
		System.out.println(e1);
		
		e1.increaseSalary(10);
		
		System.out.println(e1);
		
	}
}