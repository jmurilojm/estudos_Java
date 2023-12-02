
public class ForEach {
	
	public static void main(String[] args) {
		/*
		//Sintaxe do for each

		for(tipo apelido : colecao){
			<comando 1>
			<comando 2>
		}
		*/
		
		int[] numeros = new int[] {1,2,3,4,5};
		
		for(int x = 0; x < numeros.length; x++){
			System.out.println(numeros[x]);
		}
		
		System.out.println();
		for(int numero : numeros){
			System.out.println(numero);
		}

	}
}