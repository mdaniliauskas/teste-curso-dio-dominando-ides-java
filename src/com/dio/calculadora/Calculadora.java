package com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextFloat();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextFloat();
		
		 float soma = soma(a, b);
		 float subtracao = subtracao(a, b);
		 float multiplicacao = multiplicacao(a, b);
		 float divisao = divisao(a, b);
		 
		 System.out.println("Soma: " + soma);
		 System.out.println("Subtracao: " + subtracao);
		 System.out.println("Multiplicacao: " + multiplicacao);
		 System.out.println("Divisao: " + divisao);

	}

	public static float soma(int a, int b) {
		return a + b;
	}
	public static float subtracao(int a, int b) {
		return a - b;
	}

	public static float multiplicacao(int a, int b) {
		return a * b;
	}

	public static float divisao(int a, int b) {
		return a / b;
	}		
}
