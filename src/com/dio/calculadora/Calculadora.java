package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		 float soma = soma(a, b);
		 float subtracao = subtracao(a, b);
		 float multiplicacao = multiplicacao(a, b);
		 float divisao = divisao(a, b);
		 
		 System.out.println("Soma: " + soma);
		 System.out.println("Subtracao: " + subtracao);
		 System.out.println("Multiplicacao: " + multiplicacao);
		 System.out.println(": " + divisao);

	}

	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static int divisao(int a, int b) {
		return a / b;
	}	
	
}
