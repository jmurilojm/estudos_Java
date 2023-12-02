package classes;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1,1,1970);
	}
	
	Data(int diaInicial,int mes,int ano){
		dia = diaInicial;
		this.mes = mes;
		this.ano = ano;
	}
	
	public String obterDataFormatada(){
		return "Data: "+this.dia+"/"+this.mes+"/"+this.ano;
	}
	
	public String imprimirDataFormatada(){
		return String.format("Data: %d/%d/%d",this.dia,this.mes,this.ano);
	}
	
	public void imprimirDataFormatada2(){
		System.out.println(this.obterDataFormatada());
	}
	
}