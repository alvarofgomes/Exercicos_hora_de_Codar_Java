import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Manipulação avançada
		
		//Arrays copia
		int[] original = {1,2,2,3};
		
		int[] copia = Arrays.copyOf(original, 2);
		
		System.out.println("Copiando os dois primeiro números do array original: " + Arrays.toString(copia));
		
		//Fill - preenchimento automático
		int[] numeros = new int[5];
		
		System.out.println("Inicando o Array com 0: " + Arrays.toString(numeros));
		
		//preenche o array com o número 5
		Arrays.fill(numeros, 5);
		System.out.println("Array iniciado com o número 5: " + Arrays.toString(numeros));
		
		//Transformando de array para stream
		int[] values = {1, 2, 3, 4, 5};
		
		//Fazer uma soma dos Elementos
		int sum = Arrays.stream(values).sum();
		
		System.out.println("Soma dos valores do Array: " + sum);
		
		sc.close();
	}

}
