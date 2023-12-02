package ooEstudos.calculadora;

public class Matematica {


int maior(int x, int y){
    if(x > y){
      return x;
    }else{
      return y;
    }
}


int raiz(int num){
	int valor = num , cont = 0;
	//int cont = 0;
	
	for(int x = 0;x<valor;x+=2){
    	valor -= x;
    	cont += 1;
	}return cont;
}


String romanos(int x){
    return "a";
}


int soma(String txt, int ... x){
	System.out.println(txt);
	int total = 0;
	for(int n : x){
	  total += n;
	}
    return total;
}


}
