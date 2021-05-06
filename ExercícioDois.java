package br.com.generation.Lista.seis.cinco;

import java.util.Scanner;

public class ExercícioDois {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		int numero = 0, impar = 0, par = 0;
		
		for(int cont = 1; cont < 10; cont ++) { // começo for
			System.out.println("Digite a sequencia de numeros: ");
			numero = ler.nextInt();
			if(numero %2==0) {
				par++; // par + 1, par recebe
			}
			else {
				impar++; // impar + 1, impar recebe
			}
			
		} // for
		System.out.println("A quantidade de pares é: " + par);
		System.out.println("A quantidade de ímpares é: " + impar);
	}

}
