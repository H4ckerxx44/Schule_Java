package Bedingte_Ausdruecke;

public class Stromrechnung
{
    public static void main(String[] args)
    {

        int jahresverbrauch = 3536;                //Variable für den Jahresverbrauch
        double grundpreisTarif1 = 5.75;            //Variable für den Grundpreis des ersten Tarifs
        double grundpreisTarif2 = 9.85;            //Variable für den Grundpreis des zweiten Tarifs
        double verbrauchspreisTarif1 = 0.2349;     //Variable für den Verbrauchspreis des ersten Tarifs
        double verbrauchspreisTarif2 = 0.2210;     //Variable für den Verbrauchspreis des ersten Tarifs


        //Teil der Rechnung für das Ergebnis des Tarifs
        double ergebnisTarif1 = ((jahresverbrauch * verbrauchspreisTarif1) + (12 * grundpreisTarif1)) * 100 + 0.5;
        double ergebnisTarif2 = ((jahresverbrauch * verbrauchspreisTarif2) + (12 * grundpreisTarif2)) * 100 + 0.5;

        //Ausgabe und Beendung der Berechnugn für das Ergebnis des Tarifs
        System.out.println((int)(ergebnisTarif1) / 100.0);
        System.out.println((int)(ergebnisTarif2) / 100.0);
    }
}
