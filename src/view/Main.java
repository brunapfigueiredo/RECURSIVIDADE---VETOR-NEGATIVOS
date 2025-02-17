package view;

import java.util.Scanner;
import controller.VetorNegativos;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		VetorNegativos comparacaoNegativos = new VetorNegativos();
		
		System.out.print("Digite o tamanho do seu vetor: ");
        int tamanho = scanner.nextInt();
        
        int[] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }
        
        int resultado = comparacaoNegativos.comparacaoNegativos(vetor, tamanho);
        
        System.out.println("O total de números negativos no vetor é: " + resultado);

        scanner.close();
	}

}
