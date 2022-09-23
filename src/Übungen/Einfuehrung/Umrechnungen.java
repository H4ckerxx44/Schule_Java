package Übungen.Einfuehrung;

public class Umrechnungen
{

	public static void main(String[] args)
	{
		System.out.println((((40 - 32) * 5) / 9));    //Ergebnis der Formel für F zu C mit 40 F
		System.out.println((((41 - 32) * 5) / 9));    //Ergebnis der Formel für F zu C mit 41 F

		System.out.println(100 * 10000 / 11401);    //Ergebnis der Formel für CHF zu € mit 100 CHF
		System.out.println(10000 * 10000 / 11401);  //Ergebnis der Formel für CHF zu € mit 10000 CHF

		System.out.println((5 % 60));    //Ausdruck für das Umschreiben einer Uhr mit 5 Minuten
		System.out.println((59 % 60));  //Ausdruck für das Umschreiben einer Uhr mit 59 Minuten
		System.out.println((100));  //Ausdruck für das Umschreiben einer Uhr mit 60 Minuten
		System.out.println((100) + (61 % 60));  //Ausdruck für das Umschreiben einer Uhr mit 61 Minuten
		System.out.println(((825 / 60) * 100) + (825 % 60));  //Ausdruck für das Umschreiben einer Uhr mit 825 Minuten
	}
}
