import java.util.ArrayList;

public class Program
{
    public static void main(String[] args) {
        
        Conta c1 = new Conta("Cicrano de Tal","288-7",5000);
        Conta c2 = new Conta("Fulano de Sobrenome","249-1",600);
        
        c1.saldo();
        c2.saldo();
        
        c1.sacar(500);
        c1.sacar(5000);
        c1.sacar(250);
        c1.depositar(25);
        
        c1.tranferir(500,c2);
        
        c1.extrato();
        c2.extrato();
        
        
    }
}


class Pessoa {
    
    private String nome;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
}


class Conta {
    
    private Pessoa titular = new Pessoa();
    private String numero;
    private double saldo;
    private ArrayList<String> historico;
    
    public Conta(String nome,String numero,double saldo){
        this.setNumero(numero);
        this.setSaldo(saldo);
        historico = new ArrayList<>();
        this.setTitular(nome);
    }
    
    
    public void saldo(){
        System.out.println("<<< SALDO >>>");
        System.out.println("Nome: "+this.titular.getNome());
        System.out.println("Conta: "+this.numero);
        System.out.println("Saldo: "+this.saldo+"\n");
    }
    
    private void infor(){
        System.out.println("Nome: "+this.titular.getNome());
        System.out.println("Conta: "+this.numero);
        System.out.println("Saldo: "+this.saldo+"\n");
    }
    private void inforDois(){
        System.out.println("Titular: "+titular.getNome());
        System.out.println("Conta: "+numero);
    }
    
    public void depositar(double valorDeposito){
        if(valorDeposito > 0){
            this.saldo += valorDeposito;
            historico.add("• Depósito R$ "+valorDeposito);
            System.out.println("<<< DEPÓSITO >>>");
            inforDois();
            System.out.println("• Depósito de R$ "+valorDeposito+" realizado!\n");
            this.saldo();
        }
    }
    
    public void sacar(double valorSaque){
        if(valorSaque <= this.saldo && valorSaque > 0){
            this.saldo -= valorSaque;
            historico.add("• Saque: R$ "+valorSaque);
            System.out.println("<<< SAQUE >>>");
            inforDois();
            System.out.println("• Saque de R$ "+valorSaque+" realizado!\n");
            this.saldo();
        }
        else{
            System.out.println("<<< SAQUE >>>");
            inforDois();
            System.out.println("• Saldo para saque, insuficiente!\n");
            this.saldo();
        }
    }
    
    public void tranferir(double valorTransferencia,Conta conta){
        if(valorTransferencia <= this.saldo && valorTransferencia > 0){
            this.saldo -= valorTransferencia;
            conta.saldo += valorTransferencia;
            historico.add("• Transferência: "+valorTransferencia+" > "+conta.titular.getNome()+" "+conta.numero);
            System.out.println("<<< TRANSFERÊNCIA >>>");
            inforDois();
            System.out.println("• Transferência realizada com sucesso!\n");
            this.saldo();
            conta.saldo();
        }
        else{
            System.out.println("<<< TRNSFERÊNCIA >>>");
            inforDois();
            System.out.println("• Saldo para tranferência, insuficiente!\n");
            this.saldo();
        }
    }
    
    public void extrato(){
        System.out.println("<<< EXTRATO - CONTA >>>");
        inforDois();
        for(String historia : historico){
            System.out.println(historia);
        }
        System.out.println();
        System.out.println("Saldo atual: R$ "+saldo+"\n");
    }
    
    private void setTitular(String nome){
        if(this.titular.getNome() == null){
            titular.setNome(nome);
        }
        else{
        //opcao de else se for deixar o metodo como publico
            System.out.println("ATENÇÃO!\nCliente com dados já definidos.");
        }
    }
    private void setNumero(String numero){
        if(this.numero == null){
            this.numero = numero;
        }
        else{
        //opcao de else se for deixar o metodo como publico
            System.out.println("ATENÇÃO!\nCliente com dados já definidos.");
        }
    }
    private void setSaldo(double saldo){
        if(this.saldo == 0){
            this.saldo = saldo;
        }
        else{
        //opcao de else se for deixar o metodo como publico
            System.out.println("ATENÇÃO!\nCliente com dados já definidos.");
        }
    }
    
}