package edu.n1.exercise_2;

public class Car {
	
	private static final String TRADEMARK = "Opel";
	private static String model;
	private final String power; 
	
	public Car (String model, String power) {
		this.model = model;
		this.power = power;
	//	TRADEMARK = "x"; 
	}
	
	public static void brake (){
		System.out.println("El vehicle està frenant.");
	}
	
	public void speedUp (){
		System.out.println("El vehicle està accelerant.");
	}

	public String getPower() {
		return power;
	}

	public String getModel() {
		return model;
	}
		
	public static String getModelCorrectly(){
		return model;	  
	}

	public static String getTrademark() {
		return TRADEMARK;
	}
}
