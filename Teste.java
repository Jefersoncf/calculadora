package desafios;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Double armazenamento = 0.0;
		int menu = 6;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("ARMAZENAMENTO " + armazenamento);
			mostrarMenu();
			System.out.println("DIGITE SUA OPÇÃO: ");
			menu = teclado.nextInt();
			switch (menu) {
			case 1:
				armazenamento = soma(armazenamento);
				break;
			case 2:
				armazenamento = subtrair(armazenamento);
				break;
			case 3:
				armazenamento = multiplicar(armazenamento);
				break;
			case 4:
				armazenamento = dividir(armazenamento);
				break;
			case 5:
				armazenamento = 0.0;
				break;

			default:
				System.out.println("OPÇÃO ");
				break;
			}
		} while (menu != 6);

	}

	public static void mostrarMenu() {
		System.out.println("(1) SOMAR");
		System.out.println("(2) SUBTRAIR");
		System.out.println("(3) MULTIPLICAR");
		System.out.println("(4) DIVIDIR");
		System.out.println("(5) LIMPAR DADOS");
		System.out.println("(6) SAIR");
	}

	public static double soma(Double x) {
		return x + entrada("SOMAR");
	}

	public static double subtrair(Double x) {
		return x - entrada("SUBTRAIR");
	}

	public static double multiplicar(Double x) {
		return x * entrada("MULTIPLICAR");
	}

	public static double dividir(Double x) {
		return (double) (x / entrada("DIVIDIR"));
	}

	public static double entrada(String className) {
		System.out.println("DIGITE O NUMERO QUE DESEJA " + className + ":");
		Scanner teclado = new Scanner(System.in);
		return teclado.nextDouble();
	}

}
