package Vorlesungen.Bedingte_Ausdrücke;

/**
 * Diese Klasse führt einfache Berechnungen mit Hilfe bedingter Ausdrücke durch.
 * Der Zweck dieser Klasse ist, Code-Beispiele für die Anwendung bedingter
 * Ausdrücke zu zeigen.
 */
public class BedingteAusdruecke
{

	/**
	 * Führt die Berechnungen durch und gibt die Ergebnisse auf dem Bildschirm
	 * aus.
	 *
	 * @param args wird nicht verwendet
	 */
	public static void main(String[] args)
	{

		/*
		 * Ausdruck zur Berechnung des Betrags von a. Belegen Sie a mit
		 * positiven und negativen ganzen Zahlen und beobachten Sie die Ausgabe.
		 */
		int a = 20;
		System.out.println(a >= 0);
		System.out.println((a >= 0)
				? a
				: -a);

		/*
		 * Beispiel für zwei verschachtelte bedingte Ausdrücke. Wenn der Wert
		 * von a nicht größer als 0 ist, wird der Nein-Zweig ausgewertet. Dieser
		 * enthält wieder einen bedingten Ausdruck.
		 */
		System.out.println((a > 0)
				? 1
				: ((a == 0)
				? 0
				: -1));

		/*
		 * Bedingter Ausdruck, der Teil eines anderen Ausdrucks ist. Der gesamte
		 * Ausdruck berechnet 10 plus Betrag von a.
		 */
		System.out.println(10 + ((a >= 0) ? a : -a));

		/*
		 * Bedingter Ausdruck, bei dem die Typen des Ja- und Nein-Zweigs
		 * ungleich sind. Der Typ des Ja-Zweigs (int) ist aber in den Typ des
		 * Nein-Zweigs (double) implizit konvertierbar, deshalb ist der bedingte
		 * Ausdruck gültig. Sein Typ ist der breitere der beiden Typen, also
		 * double.
		 */
		double d = (a >= 0) ? 5 : 2.5;

		/*
		 * Da der Typ des bedingten Ausdrucks double ist, ist diese Zuweisung
		 * unzulassig.
		 */
		// int b = (a >= 0) ? 5 : 2.5;
	}
}