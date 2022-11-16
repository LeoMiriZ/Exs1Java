import java.util.Random;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int[] y = new int[10];
		int[] z = new int[10];
		int num;

		y = preencher();

		imprimir(y);

		z = ordenar(y);

		System.out.println();
		System.out.println("\nInsira um número que deseja procurar no vetor--> ");
		num = teclado.nextInt();

		busca(z, num);
		
		teclado.close();

	}

	public static int[] preencher() {

		Random gerador = new Random();

		int[] x = new int[10];

		for (int i = 0; i < x.length; i++) {

			x[i] = gerador.nextInt(1, 100);

		}

		return x;

	}

	public static void imprimir(int[] y) {

		System.out.println("Antes da ordenação:");
		for (int i = 0; i < y.length; i++) {

			System.out.print(y[i] + "\t");
		}

	}

	public static int[] ordenar(int[] z) {

		int j, k, aux;

		for (j = 0; j < 10; j++) {

			for (k = 0; k < 9; k++) {

				if (z[k] > z[k + 1]) {

					aux = z[k];

					z[k] = z[k + 1];

					z[k + 1] = aux;

				}

			}
		}
		System.out.println();
		System.out.println("\nDepois da ordenação:");
		for (int i = 0; i < z.length; i++) {

			System.out.print(z[i] + "\t");

		}

		return z;

	}

	public static boolean busca(int[] z, int num) {

		int mid = (z.length) / (2) - 1;

		if (num == z[mid]) {

			System.out.println("Número encontrado!");
			return true;

		}

		if (num > z[mid]) {

			for (int i = (mid + 1); i < z.length; i++) { 

				if (num == z[i]) {
					System.out.println("Número encontrado!");
					return true;

				}

			}

			System.out.println("Número não encontrado!");

			return false;

		} else {

			for (int i = 0; i <= (mid - 1); i++) {

				if (num == z[i]) {
					System.out.println("Número encontrado!");
					return true;

				}
			}

			System.out.println("Número não encontrado!");

			return false;

		}
	}
}

