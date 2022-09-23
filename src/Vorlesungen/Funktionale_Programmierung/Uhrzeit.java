package Vorlesungen.Funktionale_Programmierung;

/**
 * Diese Klasse stellt Methoden zum Rechnen mit Uhrzeiten
 * zur Verfügung. Uhrzeiten werden als ganze Zahlen im Format
 * SSMMss (S=Stunde, M=Minute, s=Sekunde) dargestellt, wobei
 * führende Nullen in der SSMMss-Darstellung entfallen.
 * <p>
 * Beispiel: 0 Uhr, 0 Minuten und 12 Sekunden wird als
 * 12 dargestellt; 23 Uhr, 45 Minuten und 7 Sekunden wird
 * als 234507 dargestellt.
 */
public class Uhrzeit
{

	/**
	 * Addiert zu einer Zeit eine Anzahl Stunden, Minuten und
	 * Sekunden hinzu.
	 *
	 * @param uhrzeit   Uhrzeit, zu der Stunden, Minuten und Sekunden
	 *                  addiert werden
	 * @param stdMinSek Angabe von Stunden, Minuten und Sekunden,
	 *                  die zur Uhrzeit hinzuaddiert werden. Die Angabe erfolgt
	 *                  im Format wie eine Uhrzeit, wobei der Stundenanteil
	 *                  mehr als 2-stellig sein darf
	 * @return neue Uhrzeit
	 */
	public static int addiereZeit(int uhrzeit, int stdMinSek)
	{

		/* Die Addition erfolgt auf der Basis von Sekunden.
		 */
		int anzahlSekunden = berechneSekSeitMitternacht(uhrzeit)
				+ berechneSekSeitMitternacht(stdMinSek);

		/* Die resultierende Anzahl Sekunden kann größer als
		 * 24 Stunden sein. Die auf ganze Tage entfallenden
		 * Sekunden werden abgezogen, die verbleibenden Sekunden
		 * werden im Uhrzeitformat zurückgegeben.
		 */
		return konvertiereSekInUhrzeit(anzahlSekunden % (24 * 60 * 60));
	}

	/**
	 * Ermittelt die Sekunden-Differenz zwischen zwei Uhrzeiten.
	 * Genauer: Es wird die Zeit (in Sekunden) berechnet, die verstreichen
	 * muss, damit ausgehend von der ersten Uhrzeit die zweite Uhrzeit
	 * erreicht wird.
	 * <p>
	 * Beispiel: Die Differenz von 130500 und 110500 beträgt
	 * 79200 (das sind 22 Stunden), denn es müssen 22 Stunden
	 * verstreichen, damit von 13:05:00 die Zeit 11:05:00
	 * erreicht wird.
	 *
	 * @param uhrzeit1 erste Uhrzeit
	 * @param uhrzeit2 zweite Uhrzeit; es wird davon ausgegangen,
	 *                 dass diese Uhrzeit einen späteren Zeitpunkt als uhrzeit1
	 *                 bezeichnet
	 * @return Differenz beider Zeiten in Sekunden
	 */
	public static int berechneZeitdifferenz(int uhrzeit1, int uhrzeit2)
	{

		/* Die Ermittlung der Differenz erfolgt auf der Basis
		 * von Sekunden.
		 */
		int uhrzeit2InSek = berechneSekSeitMitternacht(uhrzeit2);
		int uhrzeit1InSek = berechneSekSeitMitternacht(uhrzeit1);

		return uhrzeit2InSek - uhrzeit1InSek;
	}

	/**
	 * Rechnet eine Uhrzeit in die Anzahl Sekunden um, die seit
	 * Mitternacht vergangen sind.
	 *
	 * @param uhrzeit Uhrzeit, die umgerechnet wird
	 * @return Sekunden seit Mitternacht
	 */
	public static int berechneSekSeitMitternacht(int uhrzeit)
	{

		/* Zeitbestandteile durch Division und Restoperation ausschneiden.
		 */
		int sekunden = uhrzeit % 100;
		int minuten = uhrzeit / 100 % 100;
		int stunden = uhrzeit / 100 / 100;

		return (stunden * 60 + minuten) * 60 + sekunden;
	}

	/**
	 * Rechnet eine Anzahl Sekunden seit Mitternacht in
	 * eine Uhrzeit um. Es wird davon ausgegangen, dass
	 * die Anzahl Sekunden einen Tag nicht überschreitet.
	 *
	 * @param anzahlSekunden Anzahl Sekunden seit Mitternacht
	 * @return Uhrzeit
	 */
	public static int konvertiereSekInUhrzeit(int anzahlSekunden)
	{

		int anzahlMinuten = anzahlSekunden / 60;
		int anzahlStunden = anzahlMinuten / 60;

		/* Formatiertes Ergebnis durch Multiplikation mit
		 * 10er-Potenzen.
		 */
		return anzahlStunden * 10000
				+ (anzahlMinuten % 60) * 100
				+ (anzahlSekunden % 60);
	}

	/**
	 * Führt die Methoden dieser Klasse mit Testdaten aus und
	 * gibt die Ergebnisse auf dem Bildschirm aus.
	 *
	 * @param args wird nicht verwendet
	 */
	public static void main(String[] args)
	{

		int uhrzeit1 = 12;      // 00:00:12
		int uhrzeit2 = 110510;  // 11:05:10

		System.out.println(berechneZeitdifferenz(uhrzeit1, uhrzeit2));

		System.out.println(berechneZeitdifferenz(0, uhrzeit2));
		System.out.println(berechneZeitdifferenz(0, uhrzeit1));

		System.out.println(addiereZeit(uhrzeit2, 0));
		System.out.println(addiereZeit(uhrzeit1, 0));

		System.out.println(addiereZeit(uhrzeit2, 240000));
		System.out.println(addiereZeit(uhrzeit1, 240000));

		System.out.println(addiereZeit(uhrzeit2, 125449));
		System.out.println(addiereZeit(uhrzeit2, 125450));
	}
}