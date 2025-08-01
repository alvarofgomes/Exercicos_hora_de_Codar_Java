import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de linhas: ");
		int l = sc.nextInt();
		System.out.println("Digite a quantidade de colunas: ");
		int c = sc.nextInt();
		
		double[][] mat = new double[l][c];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.println("Digite o número da linha " + i + " e coluna " + j + ": ");
				mat[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("Matriz com negativos");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.println(mat[i][j]);
			}
			System.out.println();
		}
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				if(mat[i][j] < 0 ) {
					mat[i][j] = 0;
				}
			}
		}
		System.out.println("Matriz sem negativos");
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat.length; j++) {
				System.out.println(mat[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}

}
