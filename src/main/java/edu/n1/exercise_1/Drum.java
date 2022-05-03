package edu.n1.exercise_1;

public class Drum extends MusicalInstrument  {

	protected Drum(String name, int price) {
		super(name, price);
	}

	@Override
	public void play() {
		System.out.println("Està sonant un instrument de percussió.");
	}
	
}
