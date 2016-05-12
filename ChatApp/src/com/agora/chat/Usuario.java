package com.agora.chat;

import com.agora.observerDP.*;

public class Usuario implements Observer {

	private String name;
	private String mensaje;

	// Mantengo la referencia del grupo
	private Subjet grupo;

	public Usuario(Subjet grupo, String name) {

		// Guardo la referencia para el objeto Grupo asi
		// puedo hacer llamada de sus metodos
		this.name = name;
		this.grupo = grupo;

		// Mensaje que notifica de que hay un nuevo Usuario

		System.out.println("Nuevo usuario " + this.name);

	}

	public void changeName(String name) {
		this.name = name;
	}

	public String getName() {

		return this.name;

	}

	@Override
	public void notify(String name, String newMensaje) {

		this.name = name;
		mensaje = newMensaje;
		
		printInfo();
		

	}
	
	public void printInfo(){
		
		System.out.println(name  + ": " + mensaje);
	}

}
