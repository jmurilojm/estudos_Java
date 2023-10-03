public class Program
{
    public static void main(String[] args) {
		
        Pessoa p = new Pessoa(87);
        Sorvete s = new Sorvete(0.1);
        Feijao f = new Feijao(0.05);
        Arroz a = new Arroz(0.07);
        
        p.infor();
        
        p.comer(f);
        
        p.infor();
        
        p.comer(a);
        
        p.infor();

	}
}

public class Pessoa {
    
    private double peso;

    public Pessoa(double peso){
        setPeso(peso);
    }
    
    void comer(Comida comida){
        this.peso += comida.getPeso();
    }
    void infor(){
        System.out.printf("Peso: %.2f\n",peso);
    }
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }
    
}

public class Comida {
    
    private double peso;
    
    public Comida(double peso){
        setPeso(peso);
    }
    
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        if(peso >= 0){
            this.peso = peso;
        }
    }
    
}

public class Sorvete extends Comida {
    
    public Sorvete(double peso){
        super(peso);
    }
    
}

public class Feijao extends Comida {

    public Feijao(double peso){
        super(peso);
    }
    
}

public class Arroz extends Comida{
    
    public Arroz(double peso){
        super(peso);
    }
    
}