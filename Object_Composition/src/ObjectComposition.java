/*
- Composição de objetos é u  princípio da Programação Orientada a Objetos(POO), 
  onde um objeto é composto por outros objetos; 
  
- Na composição, um objeto maior contém outros menores como atributos, 
  combinado suas fucionalidades para formar comportamentos mais complexos;
  
- A composição oferece uma alternativa à herança, favorecendo a reutilização de código sem]
  criar dependências rígidas entre classes;  
  
- Uma diferença para herança e que, Ex:

	+ Composition: Aluno tem endereço:Aluno tem um endereço 
	+ Herança: Aluno e uma pessoa: Aluno extends Pessoa

*/

import java.util.*;

public class ObjectComposition {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Motor m1 = new Motor("V8", 450);
		Carro c1 = new Carro("Ford", "Mustang", m1);
		
		c1.exibirInfo();
		
		sc.close();
	}

}