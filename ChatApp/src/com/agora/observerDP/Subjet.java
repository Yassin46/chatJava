package com.agora.observerDP;


public interface Subjet {
	
	public void register(Observer o);
	public void unregister(Observer o);
	public void notifyObserver(String name, String mensaje);

}
