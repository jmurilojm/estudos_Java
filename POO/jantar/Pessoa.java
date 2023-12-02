package desafios;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	public void comer(Comida x){
		if(x != null){
			this.peso = this.peso + x.peso;
		}
	}
	
	public String infor(){
		return "Sou "+this.nome+" e tenho "+this.peso+" Kg.";
	}
	
}