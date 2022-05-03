package edu.n1.exercise_1;

public class Flute extends MusicalInstrument {

	protected Flute(String name, int price) {
		super(name, price);
	}

	@Override
	public void play() {
		System.out.println("Està sonant un instrument de vent.");
	}

}
