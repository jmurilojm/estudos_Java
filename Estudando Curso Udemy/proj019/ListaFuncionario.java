package proj019;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ListaFuncionario {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.print("Total de funcionarios: ");
		int total = input.nextInt();
		
		
		for(int x = 0; x < total; x++){
			System.out.print("Id: ");
			int id = input.nextInt();
			System.out.print("Nome: ");
			String nome = input.next();
			System.out.print("Salário: ");
			double salario = input.nextDouble();
			
			funcionarios.add(new Funcionario(id,nome,salario));
		}
		
		
		System.out.print("\nID do funcionário: ");
		int idParaMudanca = input.nextInt();
		for(Funcionario f : funcionarios){
			if(idParaMudanca == f.getId()){
				System.out.print("Porcentagem de aumento: ");
				int porcento = input.nextInt();
				f.aumentoSalario(porcento);
			}
		}
		
		
		System.out.println();
		for(Funcionario f : funcionarios){
			System.out.println(f);
		}
		
		
		input.close();
	}
}



class Funcionario {

	private int id;
	private String nome;
	private double salario;
	
	public Funcionario(int id,String nome,double salario){
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getId(){
		return id;
	}
	public void setNome(String newNome){
		this.nome = newNome;
	}
	public String getNome(){
		return nome;
	}
	public double getSalario(){
		return salario;
	}
	
	public void aumentoSalario(int porcentagem){
		salario += salario * porcentagem / 100;
	}
	
	public String toString(){
		return "\nId: "+id+"\nNome: "+nome+"\nSalario: "+salario;
	}

}