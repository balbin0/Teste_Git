package es.indra.treinamento;

import java.util.Arrays;
import java.util.List;


public class App {
	public static void main(String[] args) {
		List<String> arguments = Arrays.asList(args);
		if (arguments.isEmpty()) {
			System.out.println("Ol�!");
		}
		else {
			System.out.println("Ol�! Voc� me passou os seguintes argumentos: ");
			arguments.stream().forEach(System.out::println);
		}
	}
}
