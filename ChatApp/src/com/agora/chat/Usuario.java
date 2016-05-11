package com.agora.chat;

import com.agora.observerDP.*;

public class Usuario implements Observer {

	private String name;

	// Mantengo la referencia del grupo
	private Subjet grupo;

	public Usuario(Subjet grupo, String name) {

		// Guardo la referencia para el objeto Grupo asi
		// puedo hacer llamada de sus metodos
		this.name = name;
		this.grupo = grupo;

		// Mensaje que notifica de que hay un nuevo Usuario

		System.out.println("New Observer " + this.name);

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {

		return this.name;

	}

	@Override
	public void notify(String name, String newMensaje) {

		System.out.println(name + " : " + newMensaje);

	}

}
