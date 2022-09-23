package Übungen.Lokale_Variablen;

public class Reiskoerner
{
	public static void main(String[] args)
	{

		int Reiskorn = 3;               //erzeugt Reiskorn mit Größe von 3
		int prozentualeErhoehung = 50;
		int summe = Reiskorn;       //erzeugt Summe mit Größe von 0 und addiert Reiskorn

		System.out.println(Reiskorn);

		Reiskorn = (Reiskorn + (Reiskorn * prozentualeErhoehung) / 100);  //gibt dem Reiskorn einen neuen Wert basierend auf dem alten Wert*1.5 (50% mehr)
		summe = summe + Reiskorn;   //nimmt die letzte Summe und addiert den neuen Reiskorn-Wert
		System.out.println(Reiskorn);   //gibt den Wert des Reiskorns aus

		Reiskorn = (Reiskorn + (Reiskorn * prozentualeErhoehung) / 100);
		summe = summe + Reiskorn;
		System.out.println(Reiskorn);

		Reiskorn = (Reiskorn + (Reiskorn * prozentualeErhoehung) / 100);
		summe = summe + Reiskorn;
		System.out.println(Reiskorn);

		Reiskorn = (Reiskorn + (Reiskorn * prozentualeErhoehung) / 100);
		summe = summe + Reiskorn;
		System.out.println(Reiskorn);

		Reiskorn = (Reiskorn + (Reiskorn * prozentualeErhoehung) / 100);
		summe = summe + Reiskorn;
		System.out.println(Reiskorn);

		Reiskorn = (Reiskorn + (Reiskorn * prozentualeErhoehung) / 100);
		summe = summe + Reiskorn;
		System.out.println(Reiskorn);

		Reiskorn = (Reiskorn + (Reiskorn * prozentualeErhoehung) / 100);
		summe = summe + Reiskorn;
		System.out.println(Reiskorn);

		System.out.println(summe);      //gibt den Wert der Summe aus

	}
}
