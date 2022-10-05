package Problemstellungen.OrtiLösungen;

public class Berechnungen {
	// Anlegen der Variablen
	int geschwindigkeit;

	// Anlegen der Methoden

	// Methode Bremsweg
	public static void reBremsweg(int geschwindigkeit)
	{
		// this.geschwindigkeit = eiGeschwindigkeit;
		int awBremsweg;
		awBremsweg = (geschwindigkeit / 10) * (geschwindigkeit / 10);
		System.out.println("Der Bremsweg beträgt:" + " " + awBremsweg + "m");
	}

	// Methode Reaktionsweg
	public static void reReaktionsweg(int geschwindigkeit)
	{
		int awReaktionsweg;
		awReaktionsweg =  (geschwindigkeit / 10) * 3;
		System.out.println("Der Reaktionsweg beträgt:" + " " + awReaktionsweg + "m");
	}

	// Methode Anhalteweg
	public static void reAnhalteweg(int geschwindigkeit)
	{
		int awAnhalteweg;
		// awAnhalteweg = Reaktionsweg + Bremsweg;
		awAnhalteweg = ((geschwindigkeit / 10) * (geschwindigkeit / 10)) + ((geschwindigkeit / 10) * 3);
		System.out.println("Der Anhalteweg beträgt:" + " " + awAnhalteweg + "m");
	}

	// Methode Gefahrenbremsung
	public static void reGefahrenbremsung(int geschwindigkeit)
	{
		int awGefahrenbremsung;
		awGefahrenbremsung = ((geschwindigkeit / 10) * (geschwindigkeit / 10)) / 2;
		System.out.println("Der Weg der Gefahrenbremsung beträgt:" + " " + awGefahrenbremsung + "m");
	}
}
