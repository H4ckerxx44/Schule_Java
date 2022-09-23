package Vorlesungen.Klassen_und_Objekte;


/**
 * Ein Objekt dieser Klasse repräsentiert ein Rechteck in einer 2D-Ebene. Die
 * Seiten des Rechtecks liegen parallel bzw. senkrecht zur horizontalen und
 * vertikalen Koordinaten-Achse.
 */
public class Rechteck
{

	/**
	 * Ursprung, d.h. linke obere Ecke dieses Rechtecks.
	 */

	private final Punkt ursprung;

	/**
	 * Breite dieses Rechtecks.
	 */
	private double breite;

	/**
	 * Höhe dieses Rechtecks.
	 */
	private double hoehe;

	/**
	 * Erzeugt ein Rechteck, dessen Breite und Höhe 0 ist. Der Ursprung des
	 * Rechtecks ist der Punkt (0, 0).
	 */
	public Rechteck()
	{

		this.ursprung = new Punkt(0, 0);
		this.breite = 0;
		this.hoehe = 0;
	}

	/**
	 * Erzeugt ein Rechteck mit der angegebenen Breite und Höhe. Der Ursprung
	 * liegt bei (0, 0).
	 *
	 * @param breite Breite dieses Rechtecks
	 * @param hoehe  Höhe dieses Rechtecks
	 */
	public Rechteck(double breite, double hoehe)
	{

		this.ursprung = new Punkt(0, 0);
		this.breite = breite;
		this.hoehe = hoehe;
	}

	/**
	 * Erzeugt ein Rechteck mit den angegebenen Koordinaten.
	 *
	 * @param x      horizontaler Ursprung dieses Rechtecks
	 * @param y      vertikaler Ursprung dieses Rechtecks
	 * @param breite Breite dieses Rechtecks
	 * @param hoehe  Höhe dieses Rechtecks
	 */
	public Rechteck(double x, double y, double breite, double hoehe)
	{

		this.ursprung = new Punkt(x, y);
		this.breite = breite;
		this.hoehe = hoehe;
	}

	/**
	 * Veranschaulicht Zugriffe auf Instanzvariablen der Klasse Rechteck.
	 *
	 * @param args wird nicht verwendet
	 */
	public static void main(String[] args)
	{

		/*
		 * Variablen deklarieren, die in den folgenden Testanweisungen benötigt
		 * werden.
		 */
		Rechteck r1;
		Rechteck r2;

		r1 = new Rechteck(1, 2, 3, 4);

		/*
		 * Instanzvariable dieses Rechtecks in Ausdrücken verwenden. Wichtig:
		 * der Zugriff auf *private* Instanzvariablen einer Klasse ist nur aus
		 * Methoden dieser Klasse möglich. Der Programm, der hier gezeigt wird,
		 * wäre z.B. in der Klasse RechteckTest nicht möglich.
		 */
		System.out.println(r1.breite);
		System.out.println((r1.breite + r1.hoehe) / 2);

		/*
		 * Instanzvariablen dieses Rechtecks Werte zuweisen.
		 */
		r1.breite = 4.5;
		System.out.println(r1.breite);

		/*
		 * Zuweisung an Instanzvariable hat Effekt nur für genau das Objekt,
		 * dessen Variable man anspricht.
		 */
		r1 = new Rechteck(1.5, 1);
		r2 = new Rechteck(2.5, 2);
		r1.breite = 15.5;
		r2.breite = 10.3;
		System.out.println(r1.breite);  // Ausgabe: 15.5
		System.out.println(r2.breite);  // Ausgabe 10.3

		/*
		 * Ähnlicher Code, aber mit "Seiteneffekt". Beachte: zwei Variablen
		 * können dasselbe Objekt enthalten.
		 */
		r1 = new Rechteck(1.5, 1);
		r2 = new Rechteck(2.5, 2);
		r1.breite = 15.5;
		r2 = r1;
		r2.breite = 10.3;
		System.out.println(r2.breite);  // Ausgabe 10.3
		System.out.println(r1.breite);  // Ausgabe auch 10.3!

		/*
		 * Der Objektausdruck vor dem Punkt muss keine Variable sein. Es ist
		 * jeder Ausdruck erlaubt, der ein entsprechendes Objekt als Wert
		 * liefert. Aber: Typen müssen beachtet werden! Hat der Objektausdruck
		 * den Typ T (wobei T eine Klasse ist), dann sind nur Instanzvariablen
		 * rechts vom Punkt (.) zulässig, die in der Klasse T bekannt sind. Dies
		 * heißt zunächst, die Instanzvariablen müssen in der Klasse T definiert
		 * sein.
		 */
		System.out.println((new Rechteck(1, 2, 3, 4)).breite);
	}

	/**
	 * Prüft, ob der übergebene Punkt innerhalb dieses Rechtecks oder auf dessen
	 * Begrenzungslinien liegt.
	 *
	 * @param punkt Punkt
	 * @return {@code true} genau dann, wenn der Punkt innerhalb dieses
	 * Rechtecks oder auf seinen Begrenzungslinien liegt
	 */
	public boolean enthaeltPunkt(Punkt punkt)
	{

		return (this.ursprung.gibX() <= punkt.gibX()
				&& punkt.gibX() <= this.ursprung.gibX() + this.breite
				&& this.ursprung.gibY() <= punkt.gibY()
				&& punkt.gibY() <= this.ursprung.gibY() + this.hoehe);

		/*
		 * so geht's auch:
		 */
		// Punkt eckpunkt = ursprung.gibVersetztenPunkt(this.breite,
		//                                              this.hoehe);
		// return (this.ursprung.istRechtsUnterhalb(punkt)
		//         && punkt.istRechtsUnterhalb(eckpunkt));
	}

	/**
	 * Liefert die Fläche dieses Rechtecks.
	 *
	 * @return Fläche dieses Rechtecks
	 */
	public double gibFlaeche()
	{

		return this.breite * this.hoehe;
	}

	/**
	 * Vergrößert dieses Rechteck um den angegebenen Faktor.
	 *
	 * @param faktor Faktor, um den das Rechteck vergrößert wird
	 */
	public void vergroessere(double faktor)
	{

		this.breite = faktor * this.breite;
		this.hoehe = faktor * this.hoehe;
	}

	/**
	 * Verschiebt dieses Rechteck um das angegebene Mass in horizontaler und
	 * vertikaler Richtung.
	 *
	 * @param xVerschiebung Verschiebung in horizontaler Richtung; durch Wert
	 *                      größer 0 wird nach rechts verschoben
	 * @param yVerschiebung Verschiebung in vertikaler Richtung; durch Wert
	 *                      größer 0 wird nach unten verschoben
	 */
	public void verschiebe(int xVerschiebung, int yVerschiebung)
	{

		this.ursprung.verschiebe(xVerschiebung, yVerschiebung);
	}

	/**
	 * Liefert das kleinste Rechteck, das dieses und das übergebene Rechteck
	 * umhüllt. Beide Rechtecke bleiben unverändert.
	 *
	 * @param rechteck ein Rechteck
	 * @return kleinstes Rechteck, das dieses Rechteck und
	 * {@code rechteck}
	 * umhüllt
	 */
	public Rechteck erzeugeHuelle(Rechteck rechteck)
	{

		/*
		 * Minimale und maximale horizontale und vertikale Koordinaten beider
		 * Rechtecke bestimmen.
		 */
		double xMin = Math.min(this.ursprung.gibX(), rechteck.ursprung.gibX());
		double yMin = Math.min(this.ursprung.gibY(), rechteck.ursprung.gibY());

		double xMax = Math.max(this.ursprung.gibX() + this.breite,
				rechteck.ursprung.gibX() + rechteck.breite);
		double yMax = Math.max(this.ursprung.gibY() + this.hoehe,
				rechteck.ursprung.gibY() + rechteck.hoehe);

		return new Rechteck(xMin, yMin, xMax - xMin, yMax - yMin);
	}

	/**
	 * Liefert eine textuelle Repräsentation dieses Rechtecks.
	 *
	 * @return textuelle Repräsentation dieses Rechtecks mit Angabe seiner
	 * Koordinaten
	 */
	public String gibAlsString()
	{

		return "Rechteck (Ursprung = "
				+ this.ursprung.gibAlsString()
				+ ", Breite = " + this.breite
				+ ", Höhe = " + this.hoehe + ")";
	}
}
