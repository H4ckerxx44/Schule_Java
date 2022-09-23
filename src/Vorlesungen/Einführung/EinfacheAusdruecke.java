package Vorlesungen.Einführung;

/**
 * Diese Klasse führt einfache Berechnungen durch Ausdrücke der Typen int und boolean
 * durch und gibt die Ergebnisse auf dem Bildschirm aus. Der Zweck dieser Klasse ist,
 * Code-Beispiele für die Anwendung vordefinierter Operatoren zu zeigen.
 */
public class EinfacheAusdruecke
{

	/**
	 * Führt die Berechnungen durch und gibt die Ergebnisse auf dem Bildschirm
	 * aus.
	 *
	 * @param args wird nicht verwendet
	 */
	public static void main(String[] args)
	{

		/* Arithmetische Operatoren */

		System.out.println(-25);

		System.out.println(20 + 30);

		/*
		 * Die Bedeutung des Symbols + ist nur mit Einschränkung die gewöhnliche
		 * mathematische Addition.
		 */
		System.out.println(2000000000 + 1000000000);

		/*
		 * Die Division zweier ganzer Zahlen liefert nur den ganzzahligen
		 * Anteil.
		 */
		System.out.println(5 / 3);

		/*
		 * Ganzzahlige Division durch 0 liefert eine sogenannte Exception.
		 * Exceptions werden später behandelt. Es handelt sich hier um eine
		 * Fehlersituation, die zum Abbruch der Programmausführung führt.
		 */
		// System.out.println(4 / 0);

		/*
		 * Restwertoperator für ganze Zahlen liefert den Rest der ganzzahligen
		 * Division des ersten durch den zweiten Operanden.
		 */
		System.out.println(20 % 6);
		System.out.println(-20 % 6);

		/*
		 * Der Restwertoperator basiert auf der Division, deshalb kommt es hier
		 * zu einer Fehlersituation.
		 */
		// System.out.println(4 % 0);

		/*
		 * Auswertungsreihenfolge bei + und *: "Punkt- vor Strichrechnung"
		 */
		System.out.println(1 + 5 * 3);

		/*
		 * Gleichrangige Operatoren werden in der Regel von links nach rechts
		 * angewendet, hier also gleichwertig zu (5 / 3) * 3.
		 */
		System.out.println(5 / 3 * 3);


		/* Relationale Operatoren */

		/*
		 * Gleichheitsoperator
		 */
		System.out.println(15 == 20);

		/*
		 * Ungleichheitsoperator
		 */
		System.out.println(15 != 20);
		System.out.println(5 + 3 != 2 + 6);


		/* Logische Operatoren */

		/*
		 * UND-Operatoren: Hier haben && und & denselben Effekt. Den Unterschied
		 * zwischen beiden Operatoren behandeln wir unten.
		 */
		System.out.println(false && true);
		System.out.println(true & false);

		/*
		 * ODER-Operatoren: Hier haben || und | denselben Effekt. Den
		 * Unterschied zwischen beiden Operatoren werden wir später behandeln.
		 */
		System.out.println(true || false);
		System.out.println(true | false);

		/*
		 * Logische Negation
		 */
		System.out.println(!(20 > 20));
		System.out.println(!(15 == 20));

		/*
		 * Es kommt zu einem Fehler, da sich der Teilausdruck 3 / 0 nicht
		 * auswerten lässt.
		 */
		// System.out.println((1 < 2) | (3 / 0 == 4));

		/*
		 * Ähnlicher Ausdruck wie zuvor. Die Operatoren || und && werden jedoch
		 * nicht strikt ausgewertet. Der zweite Operand wird nur ausgewertet,
		 * wenn dies erforderlich ist. Hier ist es nicht erforderlich, deshalb
		 * kommt es nicht zu einem Fehler wg. Division durch 0.
		 */
		System.out.println((1 < 2) || (3 / 0 == 4));
		// System.out.println((3 / 0 == 4) || (1 < 2));


		/*
		 * Beispielausdruck aus der Vorlesung
		 */
		System.out.println((2 - (4 / 2) > 0) || (12 * 2 < (2 + 3) * 5));


		/* fehlerhafte Ausdrücke */

		// System.out.println(2 + true);
		// System.out.println(!b);
	}
}