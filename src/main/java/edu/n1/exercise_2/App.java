package edu.n1.exercise_2;

public class App {

	public static void main(String[] args) {
		Car car = new Car("Corsa");
		car.speedUp(); 
		Car.brake(); //STATIC Es carrega amb la classe no amb els objectes.
	}
}
