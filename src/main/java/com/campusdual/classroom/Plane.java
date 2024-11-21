package com.campusdual.classroom;

public class Plane implements IMachine{

	private final String name;

	public Plane(String name) {
		this.name = name;
	}

	public void takeOff() {
		System.out.println("El avión despega");
	}

	public void land() {
		System.out.println("El avión aterriza");
	}

	public void fly() {
		System.out.println("El avión está volando");
	}

	public void start() {
		System.out.println("El avión " + name + " está encendido.");
	}

	public void stop(){
		System.out.println("El avion " + name + " esta apagado");
	}

	public void  maintenance(){
		System.out.println("El avion " + name + " esta en mantenimiento");
	}
}
