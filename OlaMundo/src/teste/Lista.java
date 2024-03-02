package teste;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public List<String> Lista = new ArrayList<String>();

	public Lista(List<String> lista) {		
		Lista = lista;
	}
	
	public void AddLista(String item) {
		Lista.add(item);
	}

	@Override
	public String toString() {
		return "Lista [Lista :" + Lista + "]";
	}
	
	
	
}
