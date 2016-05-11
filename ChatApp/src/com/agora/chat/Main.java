package com.agora.chat;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inicializando chat");
		
		Grupo chat1 = new Grupo();
		Usuario nuevo1 = new Usuario(chat1,"Yassin");
		Usuario nuevo2 = new Usuario(chat1,"Gabriel");
		Usuario nuevo3 = new Usuario(chat1, "Mehmet");
		
		
		nuevo1.notify("Yassin", "Hola chicos");
		nuevo2.notify("Gabriel", "Buenas que tal");
		nuevo2.notify("Mehmet", "Hallo, was ist lost?");
		
	}

}
