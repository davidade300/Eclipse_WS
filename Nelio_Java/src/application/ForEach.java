package application;

public class ForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		// sao a mesma coisa
			// tipo apelido do elemento : lista
		for (String elemento : vect) {
			System.out.println(elemento);
		}

	}
}
