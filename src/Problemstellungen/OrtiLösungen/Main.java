package Problemstellungen.OrtiLösungen;

/*
Erstellen eines Algorithmus
Errechnen von:
- Bremsweg
- Anhalteweg
- Reaktionsweg
- Gefahrenbremsung

Fabian Ortmann - ITA3
03.10.2022
**************************************************************************
*/

// Bibliothek laden
import java.util.Scanner;

// Main Klasse erstellen
public class Main {

	// Designmethode für Konsole
	public static void grafik()
	{
		System.out.println("*********************************************************************************");
	}

	// Main Methode erstellen
	public static void main(String[] args) {

		// Anlegen von Variable
		int eiGeschwindigkeit;

		// Begruessung
		System.out.println("Willkommen in diesem Programm");
		System.out.println("Sie erhalten auf Grundlage Ihrer Geschwindigkeit wichtige Informationen zu Brems-, Reaktions- und Anhaltewegen");

		// Eingabe der Geschwindigkeit
		Scanner eingabe = new Scanner(System.in);
		System.out.println("Bitte geben Sie nun die ganzzahlige Geschwindigkeit in der Einheit km/h ein.");

		// Eingabe in Variable speichern
		eiGeschwindigkeit = eingabe.nextInt();

		// Aufruf der Methoden
		Berechnungen.reBremsweg(eiGeschwindigkeit);
		grafik();
		Berechnungen.reReaktionsweg(eiGeschwindigkeit);
		grafik();
		Berechnungen.reAnhalteweg(eiGeschwindigkeit);
		grafik();
		Berechnungen.reGefahrenbremsung(eiGeschwindigkeit);
		grafik();

		// Verabschiedung
		System.out.println("Bitte achten Sie auf diese Werte um eine unfallfreie Fart zu genießen. Es sei denn K.Ante fährt Ihnen rein. Dann sind sie nicht schuld :)");
		System.out.println("Auf Wiedersehen!");

	}
}
