package ForEach;

import java.util.ArrayList;
import java.util.List;

public class Programa2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Ana");
		
		for (String nome : list) {
			System.out.println(nome);
		}
	}

}