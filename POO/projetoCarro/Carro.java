package projetoCarro;

public class Carro {

	private String nome;
	private String marca;
	private int ano;
	private int lugares = 2;
	private boolean ligado = false;
	private static criados = 0;
	
	//
	public Carro(){
	  criados += 1;
}

	//
	public void ligar(){
	  this.ligado = true;
}
	public String infor(){
	  System.out.println(this.nome);
	  System.out.println(this.marca);
	  System.out.println(this.ano);
	  System.out.println(this.lugares);
	  System.out.println(this.ligado);
}

	//
	public void setNome(String nome){
	  this.nome = nome;
}
	public void setMarca(String marca){
	  this.marca = marca;
}
	public void setAno(int ano){
	  this.ano = ano;
}
	public void setLugares(int lugares){
	  this.lugares = lugares;
}





}
