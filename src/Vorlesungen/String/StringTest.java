package Vorlesungen.String;


/**
 * Diese Klasse dient dazu, die Funktionsweise von Methoden der Klasse String
 * zu veranschaulichen.
 */
public class StringTest
{

	/**
	 * Veranschaulicht den Unterschied zwischen Gleichheit und Identität von
	 * String-Objekten.
	 */
	public static void testeGleichheit()
	{

		/*
		 * zwei String-Variablen mit gleichem Wert
		 */
		String ort1 = "Gelsenkirchen";
		String ort2 = new String("Gelsenkirchen");

		/*
		 * Wahrheitswert ausgeben, ob ort1 und ort2 denselben Wert enthalten.
		 */
		System.out.println(ort1 == ort2);

		/*
		 * Wahrheitswert ausgeben, ob ort1 und ort2 den gleichen Wert enthalten.
		 */
		System.out.println(ort1.equals(ort2));

		/*
		 * Jetzt die Zeichenketten über Konstruktor erzeugen.
		 */
		ort1 = new String("Gelsenkirchen");
		ort2 = new String("Gelsenkirchen");

		/*
		 * Wahrheitswert ausgeben, ob ort1 und ort2 denselben Wert enthalten.
		 */
		System.out.println(ort1 == ort2);

		/*
		 * Wahrheitswert ausgeben, ob ort1 und ort2 den gleichen Wert enthalten.
		 */
		System.out.println(ort1.equals(ort2));
	}

	/**
	 * Veranschaulicht die Anwendung wichtiger Instanzmethoden der Klasse
	 * String.
	 */
	public static void testeMethoden()
	{

		String s = "Gelsenkirchen";

		/*
		 * Länge des Werts in s ermitteln und ausgeben
		 */
		System.out.println(s.length());

		/*
		 * Zeichen an Position 6 holen (das ist das siebte Zeichen); Ergebnistyp
		 * der Methode charAt ist char
		 */
		char c = s.charAt(6);
		System.out.println(c);

		/*
		 * Teilwort von Position 6 bis 8 (einschließlich) ermitteln
		 */
		String teilwort = s.substring(6, 9);
		System.out.println(teilwort + ", Länge " + teilwort.length());

		/*
		 * Beachte: substring liefert immer eine ZeichenKETTE, auch wenn diese
		 * nur aus einem Zeichen besteht. Eine Zeichenkette mit einem Zeichen
		 * ist etwas anderes als dieses Zeichen selbst.
		 */
		teilwort = s.substring(6, 7);
		System.out.println(teilwort + ", Länge " + teilwort.length());

		/*
		 * Erste Position eines Worts innerhalb einer Zeichenkette ermitteln; es
		 * kommt auf die Groß-/Kleinschreibung an.
		 */
		System.out.println(s.indexOf("kirche"));
		System.out.println(s.indexOf("Kirche"));

		/*
		 * Zeichenkette erzeugen, die wie s ist, aber nur aus Groß- bzw.
		 * Kleinbuchstaben besteht; der Wert von s bleibt unverändert.
		 */
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		/*
		 * Position eines Teilworts ohne Berücksichtigung von
		 * Groß-/Kleinschreibung
		 */
		System.out.println((s.toUpperCase()).indexOf("Kirche".toUpperCase()));

		/*
		 * Statische Methode valueOf zur Erzeugung der Textdarstellung eines
		 * elementaren Werts.
		 */
		System.out.println(String.valueOf(125).length());
	}

	/**
	 * Ruft die Testmethoden und stellt die Testergebnisse auf dem Bildschirm
	 * dar.
	 *
	 * @param args wird nicht verwendet
	 */
	public static void main(String[] args)
	{

		testeGleichheit();
		testeMethoden();
	}
}