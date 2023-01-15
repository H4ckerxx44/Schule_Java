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
public class Main
{
	public static void main(String[] args)
	{

		// Anlegen von Variable
		int eiGeschwindigkeit;

		// Eingabe der Geschwindigkeit
		Scanner eingabe = new Scanner(System.in);

		// Eingabe in Variable speichern
		eiGeschwindigkeit = eingabe.nextInt();


		System.out.printf("Bremsweg: %s\n", Berechnungen.reBremsweg(eiGeschwindigkeit));
		System.out.println(Berechnungen.reReaktionsweg(eiGeschwindigkeit));
		System.out.println(Berechnungen.reAnhalteweg(eiGeschwindigkeit));
		System.out.println(Berechnungen.reGefahrenbremsung(eiGeschwindigkeit));
		System.out.println(Berechnungen.reBremsweg(Berechnungen.random()));

	}
}
