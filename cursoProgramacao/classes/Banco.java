package classes;

public class Banco {
	
	private int accountNumber;
	private String titularName;
	private double saldo = 0.00;
	static double taxSaque = 5.00;
	
	
	public Banco(int accountNumber, String titularName, double depositoInicial){
		this.accountNumber = accountNumber;
		this.titularName = titularName;
		depositar(depositoInicial);
		System.out.println(this);
	}
	public Banco(int accountNumber, String titularName){
		this.accountNumber = accountNumber;
		this.titularName = titularName;
		System.out.println(this);
	}
	
	
	public int getNumber(){
		return this.accountNumber;
	}
	public String getName(){
		return this.titularName;
	}
	public void setName(String newName){
		this.titularName = newName;
	}
	public double getSaldo(){
		return this.saldo;
	}
	
	
	public void depositar(double value){
		this.saldo += value;
		System.out.println(this.toString());
	}
	public void sacar(double value){
		double valueSaque = value + taxSaque;
		this.saldo -= valueSaque;
		System.out.println(this.toString());
	}
	public String toString(){
		return "Conta: "+accountNumber
		+"\nTitular: "+titularName
		+"\nSaldo: "+saldo;
	}
	
}