package edu.n1.exercise_1;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<MusicalInstrument> instruments = new ArrayList<MusicalInstrument>();
		Drum drum = new Drum("Bateria", 2500);
		instruments.add(drum);
		Guitar guitar = new Guitar("Guitarra", 1100);
		instruments.add(guitar);
		Flute flute = new Flute("Flauta", 650);
		instruments.add(flute);
		
		practice(instruments);
	}

	private static void practice(ArrayList<MusicalInstrument> instruments) {
		for (MusicalInstrument instrument : instruments) {
			instrument.play();
		}
	}

}
