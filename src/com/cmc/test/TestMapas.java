package com.cmc.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMapas {

	public static void main(String[] args) {
		ArrayList<String> listas= new ArrayList<String>();
		listas.add("uno");
		String valor= listas.get(0);
		
		HashMap<String, String> mapas= new HashMap<String, String>();
		mapas.put("a", "Mario");
		mapas.put("b", "Beto");
		String resultado=mapas.get("b");
		System.out.println(resultado);
	
	}

}
