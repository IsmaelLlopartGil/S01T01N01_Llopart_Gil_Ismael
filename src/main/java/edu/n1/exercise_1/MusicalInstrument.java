package edu.n1.exercise_1;

public abstract class MusicalInstrument {

	static {
		System.out.println("Bloc d'inicialitzaci� est�tica. La classe es carrega en mem�ria nom�s una vegada");
	}
	
	{
		System.out.println("Bloc d'inicialitzaci� de inst�ncia.");
	}
	
	protected String name;
	protected int price;
	
	protected MusicalInstrument (String name, int price) {
		this.name = name;
		this.price = price;
	}

	public abstract void play ();
}
