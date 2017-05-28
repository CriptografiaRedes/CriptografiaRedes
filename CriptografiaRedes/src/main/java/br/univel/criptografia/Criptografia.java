package br.univel.criptografia;

import java.util.ArrayList;

public class Criptografia {

	public static String criptografar(String conteudo, ArrayList<String> lista) {
		String criptografia = "";

		for (int i = 0; i <= conteudo.length() - 1; i++) {
			String parse = conteudo.substring(i, i + 1);
			char charAux = parse.charAt(0);
			int index = charAux;
			criptografia += lista.get(Integer.valueOf((char) index));
		}

		return criptografia;
	}

	public static String descriptografar(String conteudo, ArrayList<String> lista) {
		String descrip = "";

		for (int i = 0; i <= conteudo.length() - 1; i++) {
			String parse = conteudo.substring(i, i + 1);
			int index = lista.indexOf(parse);
			descrip += String.valueOf((char) index);
		}

		return descrip;
	}

}
