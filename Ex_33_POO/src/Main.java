import java.util.*;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		LivroBiblioteca l = new LivroBiblioteca();
		
		l.setTitulo("Java");
		l.livrodevolvido();
		l.livroEmprestado();
		
		l.livroEmprestado();
		l.livrodevolvido();
		sc.close();
	}

}