package edu.n1.exercise_2;

public class App {

	public static void main(String[] args) {
		Car car = new Car("Corsa", "95kW");
		System.out.println("Es crea el primer cotxe.");
		car.speedUp(); 
		Car.brake(); 
		System.out.println("Model i potència del cotxe 1: " + car.getModel() + " " + car.getPower());
		Car car2 = new Car("Combo", "65kW");
		System.out.println("Es crea el segon cotxe.");
		System.out.println("Model i potència del cotxe 1: " + car.getModel() + " " + car.getPower() + " <--El model canvia per a tots els objectes quan se'n crea un de nou ja que pertany a la classe no als objectes.");
		System.out.println("Model i potència del cotxe 2: " + car2.getModel() + " " + car2.getPower());
		System.out.println("No es pot modificar la potència de cap cotxe després de crear-lo, però cada cotxe tindrà la seva.");
		System.out.println("La marca pertany a la classe i no pot ser modificada. Marca: " + Car.getTrademark());
	}
}
