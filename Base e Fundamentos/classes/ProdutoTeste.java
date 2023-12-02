package classes;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Tv LG");
		Produto p2 = new Produto();
		
		//p1.nome = "TV Samsung";
		p1.preco = 1500;
		//p1.desconto = .1;
		
		p2.nome = "Celular";
		p2.preco = 1800;
		//p2.desconto = 0.1;
		
//Alterando valor de desconto para todos:
		Produto.desconto = 1.;
		
		double soma = p1.preco + p2.preco;
		double media = (p1.preco + p2.preco)/2;
		double descTv = p1.preco * Produto.desconto;
		double descCelular = p2.preco * Produto.desconto;
		double descTotal = descTv + descCelular;
		double vlPagar = soma - descTotal;
		double pagarTv = p1.precoComDesconto();
		
		System.out.println(p1.nome+"R$ "+p1.preco);
		System.out.println(p2.nome+"R$ "+p2.preco);
		
		System.out.printf("\nValor medio dos produtos: R$ %.2f",media);
		System.out.printf("\nValor real dos Produtos: R$ %.2f\n",soma);
		
		System.out.printf("\nDesconto na TV: R$ %.2f",descTv);
		System.out.printf("\nDesconto no acelular R$: %.2f",descCelular);
		System.out.printf("\nSoma dos descontos: R$ %.2f\n",descTotal);
		
		System.out.println("\nValor da Tv com Desconto: "+pagarTv);
		System.out.println("Valor do Celular com Desconto: "+p2.precoComDesconto());
		
		System.out.printf("\nTotal a pagar pos desconto: R$ %.2f\n",vlPagar);
		

	}
}