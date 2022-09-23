package Übungen.Klassen_und_Objekte;

public class RationaleZahlTest
{

	public static void main(String[] args)
	{

		RationaleZahl zahl1 = new RationaleZahl(2, 8);
		System.out.println(zahl1.gibAlsText());
		RationaleZahl zahl2 = new RationaleZahl(5, 6);

		System.out.println((zahl1.addiere(zahl2)).gibAlsText());

		System.out.println((zahl2.addiere(zahl1)).gibAlsText());

		RationaleZahl zahl3 = new RationaleZahl(17, 4);
		RationaleZahl zahl4 = new RationaleZahl(7, 4);
		System.out.println((zahl3.addiere(zahl4)).gibAlsText());

		RationaleZahl zahl5 = new RationaleZahl(100002, 4);
		RationaleZahl zahl6 = new RationaleZahl(5);
		System.out.println((zahl5.addiere(zahl6)).gibAlsText());

		RationaleZahl zahl7 = new RationaleZahl(11, 2108303);
		RationaleZahl zahl8 = new RationaleZahl(31, 2117009);
		System.out.println((zahl7.addiere(zahl8)).gibAlsText());
	}
}

