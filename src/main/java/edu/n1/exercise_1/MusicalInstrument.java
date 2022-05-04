package edu.n1.exercise_1;

public abstract class MusicalInstrument {

	static {
		System.out.println("Bloc d'inicialització estàtica. La classe es carrega en memòria només una vegada");
	}
	
	{
		System.out.println("Bloc d'inicialització de instància.");
	}
	
	protected String name;
	protected int price;
	
	
	protected MusicalInstrument (String name, int price) {
		this.name = name;
		this.price = price;
	}

	public abstract void play ();
}
