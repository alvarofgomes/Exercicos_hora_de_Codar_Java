import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int[][] mat = new int[1][2]; 
		
		for(int i = 0; i <= mat.length; i++) {
			for(int j = 0; j <= mat.length; j++){
				
				System.out.print(j);
			}
			System.out.println(i);
		}
		System.out.println("Matriz Transpor: ");
		for(int i = 0; i <= mat.length; i++) {
			for(int j = 0; j <= mat.length; j++){
				
				System.out.print(j);
				System.out.println(i);
			}
			
		}
		
		sc.close();
	}

}
