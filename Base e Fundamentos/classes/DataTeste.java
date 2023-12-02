package classes;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		//d1.dia = 16;
		//d1.mes = 9;
		//d1.ano = 2021;
		
		Data d2 = new Data(28,3,1987);
		//d2.dia = 28;
		//d2.mes = 3;
		//d2.ano = 1987;
		
		//System.out.printf("Data de hoje: %d/%d/%d",d1.dia,d1.mes,d1.ano);
		//System.out.printf("\nData de Nascimento: %d/%d/%d\n",d2.dia,d2.mes,d2.ano);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.imprimirDataFormatada());
		d1.imprimirDataFormatada2();
		d2.imprimirDataFormatada2();
		
	}
}