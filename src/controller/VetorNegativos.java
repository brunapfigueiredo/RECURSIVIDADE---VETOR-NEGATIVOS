package controller;

public class VetorNegativos {

	public VetorNegativos() {
		super();
	}
	
	public int comparacaoNegativos(int[] vetor, int tamanho) {
		//Condição de parada - quando a posição chegar a 0, retorna 0
	    if (tamanho == 0) {
	        return 0;
	    }
	    if (vetor[tamanho - 1] < 0) {
	        return 1 + comparacaoNegativos(vetor, tamanho - 1);
	    }
	    return comparacaoNegativos(vetor, tamanho - 1);
	}
}

//TESTE DE MESA
//vetor = [-1, 4, 7, -3, 3, -2]
//tamanho = 6

//[-1, 4, 7, -3, 3, -2]     = 3
//[-2] < 0  				+1 

//[-1, 4, 7, -3, 3]
//[3] > 0  					+0

//[-1, 4, 7, -3]
//[-3] < 0  				+1

//[-1, 4, 7]
//[7] > 0 					+0

//[-1, 4]
//[4] > 0 					+0

//[-1]
//[-1] < 0 					+1