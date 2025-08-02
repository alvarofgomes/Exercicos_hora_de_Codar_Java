import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Ordenção de array de inteiros
		int[] numbers = {5,6,1,4,2,22,1};
		
		//Aqui o array modifica o array original, em algumas linguagens ela retorna.
		Arrays.sort(numbers);
		System.out.println("Ordenando os números do array: " + Arrays.toString(numbers));
		
		//Ordenação com comparator
		String[] names = {"João", "Bob", "Pedro", "Marco"};
		
		Arrays.sort(names, Comparator.reverseOrder());
		System.out.println("Ordenando os nomes: " + Arrays.toString(names));
		
		//Ordenação de matriz
		int[][] matriz = {
				{4, 5, 1},
				{3, 8, 9},
				{2, 3, 1}
		};
		//Ordenação de linhas, por um valor de coluna(Escolhe o valor da coluna)
		Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));
		for(int[] linha : matriz) {
			System.out.println("Ordenação de matriz: " + Arrays.toString(linha));
		}
		//Imprimir matriz sem etrutura de repetição(não fuciona com vetores(Listas))
		System.out.println("Matriz: " + Arrays.deepToString(matriz));
		
		sc.close();
	}

}