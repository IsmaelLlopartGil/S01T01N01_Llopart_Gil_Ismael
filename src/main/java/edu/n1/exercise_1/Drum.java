package edu.n1.exercise_1;

public class Drum extends MusicalInstrument  {

	protected Drum(String name, int price) {
		super(name, price);
	}

	@Override
	public void play() {
		System.out.println("Est� sonant un instrument de percussi�.");
	}
	
}
