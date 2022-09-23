package Vorlesungen.Klassen_und_Objekte;

/**
 * Ein Objekt dieser Klasse repräsentiert einen Punkt in einer 2D-Ebene.
 */
public class Punkt
{

	/**
	 * Horizontale Koordinate dieses Punkts.
	 */
	private double x;

	/**
	 * Vertikale Koordinate dieses Punkts.
	 */
	private double y;

	/**
	 * Erzeugt einen Punkt mit den angegebenen Koordinaten.
	 *
	 * @param x horizontale Koordinate dieses Punkts
	 * @param y vertikale Koordinate dieses Punkts
	 */
	public Punkt(double x, double y)
	{

		this.x = x;
		this.y = y;
	}

	/**
	 * Gibt an, ob der übergebene Punkt rechts unterhalb von diesem Punkt liegt.
	 *
	 * @param punkt Punkt, für den geprüft wird, ob er rechts unterhalb von
	 *              diesem Punkt liegt.
	 * @return {@code true} genau dann, wenn der übergebene Punkt rechts
	 * unterhalb von diesem Punkt liegt. Als rechts bzw. unterhalb wird
	 * auch gewertet, wenn beide Punkte dieselbe horizontale bzw.
	 * vertikale Koordinate besitzen.
	 */
	public boolean istRechtsUnterhalb(Punkt punkt)
	{

		return (this.x <= punkt.x) && (this.y <= punkt.y);
	}

	/**
	 * Liefert die horizontale Koordinate dieses Punkts.
	 *
	 * @return horizontale Koordinate dieses Punkts.
	 */
	public double gibX()
	{

		return this.x;
	}

	/**
	 * Liefert die vertikale Koordinate dieses Punkts.
	 *
	 * @return vertikale Koordinate dieses Punkts.
	 */
	public double gibY()
	{

		return this.y;
	}

	/**
	 * Verschiebt diesen Punkt um das angegebene Maß in horizontaler und
	 * vertikaler Richtung.
	 *
	 * @param xVerschiebung Verschiebung in horizontaler Richtung; durch Wert
	 *                      größer 0 wird nach rechts verschoben
	 * @param yVerschiebung Verschiebung in vertikaler Richtung; durch Wert
	 *                      größer 0 wird nach unten verschoben
	 */
	public void verschiebe(double xVerschiebung, double yVerschiebung)
	{

		this.x = this.x + xVerschiebung;
		this.y = this.y + yVerschiebung;
	}

	/**
	 * Liefert einen Punkt, der gegenüber diesem Punkt das angegebene Maß in
	 * horizontaler und vertikaler Richtung verschoben ist.
	 *
	 * @param xVerschiebung Verschiebung in horizontaler Richtung
	 * @param yVerschiebung Verschiebung in vertikaler Richtung
	 * @return neuer Punkt, der gegenüber diesem Punkt verschoben ist
	 */
	public Punkt gibVersetztenPunkt(double xVerschiebung,
									double yVerschiebung)
	{

		return new Punkt(x + xVerschiebung, y + yVerschiebung);
	}

	/**
	 * Liefert eine textuelle Darstellung dieses Punkts.
	 *
	 * @return textuelle Darstellung im Format (x, y)
	 */
	public String gibAlsString()
	{

		return "(" + this.x + ", " + this.y + ")";
	}
}
