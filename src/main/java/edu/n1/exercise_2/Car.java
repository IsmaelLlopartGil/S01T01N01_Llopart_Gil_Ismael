package edu.n1.exercise_2;

public class Car {
	
	private static final String TRADEMARK = "Opel";
	private static String model;
	private final String POWER = "95kW"; //No li veig el sentit. Es crea una vegada per cada objecte per� el valor no canvia.
	
	public Car (String model) {
		this.model = model;  // �S POSSIBLE, NO LI VEIG EL SENTIT UTILITZAT D'AQUESTA MANERA. �PODRIA USAR-SE AL CONSTRUCTOR PER COMPTAR QUANTES INST�NCIES S'HAN CREAT AMB "nombreInstancias++"?
	  //this.TRADEMARK = "x";   NO �S POSSIBLE ASSIGNAR-LI UN NOU VALOR (FINAL)
	  //this.POWER = "x";       NO �S POSSIBLE ASSIGNAR-LI UN NOU VALOR (FINAL)
	}
	
	public static void brake (){
		System.out.println("El vehicle est� frenant.");
	}
	
	public void speedUp (){
		System.out.println("El vehicle est� accelerant.");
	}
}
