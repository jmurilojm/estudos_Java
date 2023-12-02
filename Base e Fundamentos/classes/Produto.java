package classes;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = .5;
	
	Produto(){
	}
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	public double precoComDesconto(){
		double resultado = preco-preco*desconto;
		return resultado;
	}
	
}