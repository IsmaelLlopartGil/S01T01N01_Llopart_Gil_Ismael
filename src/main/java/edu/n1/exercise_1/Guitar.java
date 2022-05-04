package edu.n1.exercise_1;

public class Guitar extends MusicalInstrument {
	
	public Guitar(String name, int price) {
		super(name, price);
	}

	@Override
	public void play() {
		System.out.println("Está sonant un instrument de corda.");
	}

}
