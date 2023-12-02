package classes;

public class Pessoa {
	
	private String name;
	private int idade;
	private double altura;
	
	public Pessoa(String nome,int idade,double altura){
		this.name = nome;
		this.idade = idade;
		this.altura = altura;
	}
	public Pessoa(String nome,int idade){
		this.name = nome;
		this.idade = idade;
	}
	
	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		 this.name = newName;
	}
	public int getIdade(){
		return this.idade;
	}
	public double getAltura(){
		return this.altura;
	}
	
}