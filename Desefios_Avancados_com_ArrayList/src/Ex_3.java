import java.util.*;
import java.util.stream.Collectors;

public class Ex_3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> n1 = new ArrayList<>(Arrays.asList(1,4,5,3,3,2));
		ArrayList<Integer> n2 = new ArrayList<>(Arrays.asList(9,8,7,6,6,1));
		
		n1.addAll(n2);
		
		System.out.println("Lista 1");
		
		Collections.sort(n1);
		List<Integer> numeros = n1.stream().distinct().collect(Collectors.toList());
		
		System.out.println(numeros);
		
		sc.close();
	}

}