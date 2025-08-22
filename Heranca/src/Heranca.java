/*
	- Herança é um dos pilares da Programação Orientada a Objetos(POO);

	- Permite que uma classe herde atributos e métodos de outra classe;
	
	- Cria uma relação entre as classes, onde a subclasse é um tipo especializado de superclasse;
	
	- Herança promove o reuso do código, 
	facilitando a criação de novas classes sem duplicação de lógica
	
	- a classe que extend a classe pai e obrigada a usar as propriedades da classe pai
	
	- a subclasse tem acesso a tudo da classe superclasse
	
	- e a superclasse não tem acesso a classe filha
*/

import java.util.*;

public class Heranca {

	public static void main(String[] args) {

		Cachorro c = new Cachorro("Turca");

		c.latir();
		c.emitirSom();
		
	}

}