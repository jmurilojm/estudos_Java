package classes;

public class Empregado {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary(){
		return grossSalary - tax;
	}
	
	public void increaseSalary(double percentage){
		grossSalary += grossSalary * percentage / 100;
	}
	
	public String toString(){
		return "Nome: "+name+";\nSal. Bruto: R$ "+grossSalary+";\nSal. Líquido: R$ "+netSalary()+"\n";
	}
	
}