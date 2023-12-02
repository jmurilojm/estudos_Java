package classes;

public class Produto {
	
	// Atributos
	private String name;
	private double price;
	private int quantity;
	
	// Construtor
	public Produto(String name,double price,int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Produto(String name,double price){
		this.name = name;
		this.price = price;
	}
	public Produto(){
	}// Construtor Padrao
	
	// Metodos Getters e Setters
	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public double getPrice(){
		return this.price;
	}
	public void setPrice(double newPrice){
		this.price = newPrice;
	}
	public int getQuantity(){
		return this.quantity;
	}
	
	// Metodos
	public double valueTotalProduct(){
		return quantity * price;
	}
	public void addProduct(int quantity){
		this.quantity += quantity;
	}
	public void removeProduct(int quantity){
		this.quantity -= quantity;
	}
	public String toString(){
		return "Name: "+name
		+";\nPrice: R$ "+String.format("%.2f",price)
		+";\nQuantity: "+quantity+";\nR$ "
		+String.format("%.2f",valueTotalProduct())+"\n";
	}
}