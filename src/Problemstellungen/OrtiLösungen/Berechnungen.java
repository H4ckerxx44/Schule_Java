package Problemstellungen.OrtiLösungen;

public class Berechnungen {
	// Anlegen der Variablen
	int geschwindigkeit;

	// Anlegen der Methoden

	// Methode Bremsweg
	public static int reBremsweg(int geschwindigkeit)
	{
		// this.geschwindigkeit = eiGeschwindigkeit;
		int awBremsweg;
		awBremsweg = (geschwindigkeit / 10) * (geschwindigkeit / 10);
		return awBremsweg;
	}

	// Methode Reaktionsweg
	public static int reReaktionsweg(int geschwindigkeit)
	{
		int awReaktionsweg;
		awReaktionsweg =  (geschwindigkeit / 10) * 3;
		System.out.println("hahah");
		return awReaktionsweg;
	}

	// Methode Anhalteweg
	public static int reAnhalteweg(int geschwindigkeit)
	{
		int awAnhalteweg;
		awAnhalteweg = reBremsweg(geschwindigkeit) + reReaktionsweg(geschwindigkeit);
		return awAnhalteweg;
	}

	// Methode Gefahrenbremsung
	public static int reGefahrenbremsung(int geschwindigkeit)
	{
		int awGefahrenbremsung;
		awGefahrenbremsung = reAnhalteweg(geschwindigkeit) / 2;
		return awGefahrenbremsung;
	}

	public static int random()
	{
		return 3737;
	}
}
