package com.agora.chat;

import java.util.ArrayList;

import com.agora.observerDP.*;

public class Grupo implements Subjet {

	String nombreGrupo;

	private ArrayList<Observer> observers;

	public Grupo() {

		// Creo un ArrayList para mantener todos los usuarios

		observers = new ArrayList<Observer>();
	}

	@Override
	public void register(Observer o) {

		observers.add(o);

	}

	@Override
	public void unregister(Observer o) {
		observers.remove(o);

	}

	public void notifyObserver(String name, String mensaje) {

		for (Observer observer : observers) {
			
			observer.notify(name, mensaje);

	

		}

	}
}