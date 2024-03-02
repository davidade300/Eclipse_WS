package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrList {

	public static void main(String[] args) {

		List<String> list =  new ArrayList<>();
		
		list.add("Alex");
		list.add("Maria");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Anderson");

		System.out.println(list.size());
		
		//list.remove("Anna");
		//System.out.println(list.size());
		
		list.remove(1);
		
		//removeIf faz remoção por predicado
		//lamba      x tal que x.condicao
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for (String x : list) {
			System.out.println(x);
		}			
		System.out.println("Index of Bob: " + list.indexOf("Bob"));
		System.out.println("Index of Marco: " + list.indexOf("Marco"));

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A')
												.collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
	 
		String name = list.stream().filter(x -> x.charAt(0) == 'j')
											.findFirst().orElse(null);
		System.out.println(name);
		
	}

}
