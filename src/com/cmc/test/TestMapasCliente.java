package com.cmc.test;

import java.util.HashMap;

import com.cmc.entidades.Cliente;

public class TestMapasCliente {

	public static void main(String[] args) {
		HashMap<String, Cliente> mapa= new HashMap<String, Cliente>();
		
		mapa.put("123456", new Cliente("123456","andres"));
		mapa.put("789456",new Cliente("789456","Ramiro") );
		
		Cliente c=mapa.get("123456");
		System.out.println(c);
	}

}
