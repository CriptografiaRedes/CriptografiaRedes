package br.univel.criptografia;

import java.lang.Character.Subset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Teste {

	public static void main(String args[]) {

		ArrayList<String> lista = new ArrayList<String>();

		for (int i = 0; i <= 400; i++) {
			lista.add(String.valueOf((char) i));
		}

		// for (int i = 0; i <= lista.size() - 1; i++) {
		// System.out.print(lista.get(i) + " - ");
		// }
		// System.out.println("\nSHUFFLE \n");

		Collections.shuffle(lista);

		// for (int i = 0; i <= lista.size() - 1; i++) {
		// System.out.print(lista.get(i) + " - ");
		// }

		String teste = "bom dia";
		String criptografia = "";
		String descrip = "";
		
		for (int i = 0; i <= teste.length() - 1; i++) {
			String parse = teste.substring(i, i + 1);
			char charAux = parse.charAt(0);
			int index = charAux;
			criptografia += lista.get(Integer.valueOf((char) index));
		}

		System.out.println(criptografia);

		for (int i = 0; i <= criptografia.length() - 1; i++) {
			String parse = criptografia.substring(i, i + 1);
			int index = lista.indexOf(parse);
			descrip += String.valueOf((char) index);
		}
		
		System.out.println(descrip);
	}
}
