package classes;

public class Estudante {
	
	public String name;
	public double nota1,nota2,nota3;
	
	public double notaFinal(){
		return nota1+nota2+nota3;
	}
	
	public String status(){
		double minimo = 100 * 0.6;
		if(notaFinal() >= minimo){
			return "FINAL GRADE = "+notaFinal()+"\nPASS";
		}
		else{
			return "FINAL GRADE = "+notaFinal()+"\nFAILED"+"\nMISSING "+(minimo-notaFinal())+" pontos.";
		}
	}
	
}